package CoreJava2;

public class Local implements Central {
	
	

	public static void main(String[] args) { // create the objects in the main class

		Central lc = new Local();//initialize an object and we are taking from central to local
		lc.Green();
		lc.Red();
		lc.Yellow();
		
		Local ll = new Local();// if we want to another object with out adding in interface
		ll.Pink();
		
		
	}
	public void Pink() {
		System.out.println("Go pink");

	}
	
	
	
	@Override
	public void Green() {
		System.out.println("Go Green");

	}

	@Override
	public void Red() {
		System.out.println("Stop Red");
	}

	@Override
	public void Yellow() {
		System.out.println("Flash Yellow");
	}

}
