public class Task5b {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter string to reverse");
            return;
        }
        String input = args[0];

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }
}
