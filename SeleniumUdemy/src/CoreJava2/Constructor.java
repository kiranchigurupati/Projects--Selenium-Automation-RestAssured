package CoreJava2;

public class Constructor {
	
	//Constructor: Executes a block of code when ever an object is created and it not return any values
	//Name of the constructor should be the class name	
	
		public Constructor() //Default constructor
		{
			System.out.println("I'm the constructor");
		}
		
		public Constructor(int a, int b) //Parametrized constructor
		{
		
			System.out.println("I'm the Parametrized constructor");
			int c= a+b;
			System.out.println(c);

		}
		
		public Constructor(String S) //Parametrized constructor string 
		{
			System.out.println(S);
		}
		
		public void ConsDup() // method return value as void
		{
			System.out.println("I'm the constructoDup");

		}
	

public static void main(String[] args) {


//	Constructor cc= new Constructor();
	Constructor cc= new Constructor("Kiran"); // String Parameter
	Constructor c= new Constructor(4,5); //Defined parameters here
}

	}


