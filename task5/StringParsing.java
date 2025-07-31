package task5;

public class StringParsing {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String intStr = "123";
        String doubleStr = "45.67";
        String booleanStr = "true";

        int intValue = Integer.parseInt(intStr);
        double doubleValue = Double.parseDouble(doubleStr);
        boolean booleanValue = Boolean.parseBoolean(booleanStr);

        System.out.println("Parsed int value: " + intValue + " Type: " + ((Object)intValue).getClass().getSimpleName());
        System.out.println("Parsed double value: " + doubleValue + " Type: " + ((Object)doubleValue).getClass().getSimpleName());
        System.out.println("Parsed boolean value: " + booleanValue + " Type: " + ((Object)booleanValue).getClass().getSimpleName());
    }
}

