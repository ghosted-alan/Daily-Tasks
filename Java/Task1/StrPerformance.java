package Task1;

public class StrPerformance {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        int iterations = 100000;

        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbd.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");
    }
}
