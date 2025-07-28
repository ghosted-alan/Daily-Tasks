package Task4;

class Chat {
    private boolean senderTurn = true;

    public synchronized void send(String message) {
        while (!senderTurn) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Sender: " + message);
        senderTurn = false;
        notify();
    }

    public synchronized void receive(String message) {
        while (senderTurn) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Receiver: " + message);
        senderTurn = true;
        notify();
    }
}

public class ChatSimulation {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Chat chat = new Chat();

        Thread senderThread = new Thread(() -> {
            String[] messages = { "Hi!", "How are you?", "Goodbye!!!" };
            for (String msg : messages) {
                chat.send(msg);
                try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            }
        });

        Thread receiverThread = new Thread(() -> {
            String[] replies = { "Hello!", "I’m fine", "See you!!!" };
            for (String reply : replies) {
                chat.receive(reply);
                try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            }
        });

        senderThread.start();
        receiverThread.start();
    }
}

