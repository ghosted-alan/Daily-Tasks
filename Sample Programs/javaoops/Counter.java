package javaoops;

public class Counter{
	static int count=0;
	Counter(){
		count++;
		System.out.println(count);
	}
//	public static int getCount() {
//		return count;
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
		
//		System.out.println("Count is: "+Counter.getCount());
		

	}

}
