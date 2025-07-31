package javagenerics;

class Test<T>{
	T obj;
	
	Test(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> iobj = new Test<Integer>(20);
		System.out.println(iobj.getObject());
		
		Test<String> sobj = new Test<String>("Welcome");
		System.out.println(sobj.getObject());
	}

}
