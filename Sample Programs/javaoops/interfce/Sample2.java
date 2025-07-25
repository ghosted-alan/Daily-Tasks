package javaoops.interfce;

interface MicroPhone{
	void volume();
	
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MicroPhone obj = new MicroPhone() {
			@Override
			public void volume() {
				// TODO Auto-generated method stub
				System.out.println("Volume is High");
			}
		};
		obj.volume();
	}
	
}


