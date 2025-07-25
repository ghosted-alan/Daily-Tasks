package Task1;

public class Stringops {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String text = "HelloWorld";

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring (0 to 5): " + text.substring(0, 5));
        System.out.println("Index of 'W': " + text.indexOf('W'));
    }
}
