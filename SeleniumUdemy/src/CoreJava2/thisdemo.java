package CoreJava2;

public class thisdemo {
	
	int a= 8; // at class level
	
	public void Demo()
	{
		int a = 2; // at method level
		int b= a+this.a;
		System.out.println(b);
		System.out.println(a);
		System.out.println(this.a);
		
		//  this refers to current object - object scope lies in class level;
	}

	public static void main(String[] args) {
		thisdemo td= new thisdemo();
		td.Demo();
	}

}
