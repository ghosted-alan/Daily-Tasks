package task5;

public class Compare {

    public static void main(String[] args) {
        
        Integer intAutoBox = 100;

        Integer intNew = new Integer(100);

        System.out.println("Comparing with ==:");
        System.out.println("intAutoBox == intNew: " + (intAutoBox == intNew));

        System.out.println("Comparing with .equals():");
        System.out.println("intAutoBox.equals(intNew): " + intAutoBox.equals(intNew));
    }
}

