package Task1;

public class StringBuff {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        StringBuffer sb = new StringBuffer();
        sb.append("Java is fun!");
        System.out.println("After append: " + sb);
        sb.insert(8, "really ");
        System.out.println("After insert: " + sb);
        sb.delete(5, 8);
        System.out.println("After delete: " + sb);
    }
}

