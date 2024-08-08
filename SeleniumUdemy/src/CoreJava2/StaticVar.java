package CoreJava2;

public class StaticVar {

	String name; // these are instance variables and they are tied up with Object and changes
					// according to obj
	static String address;// when use static the variable copy is used by all objects // when u treate the
					// variable as static it
	static String City = "India"; // all static variable are class variables
	static int i =0;
//or
	static {
		 City = "India";
		 i=0;
		
		
	}
	StaticVar(String name, String address) // these are local variables
	{
		this.name = name;
		this.address = address;
//		this.City = City;
		i++;
		System.out.println(i);
	}

	public void getData() // instance Methods
	{
		System.out.println(address+" "+ City);
		

	}
	
	public static void getData1() // class Methods -- by using static
	{
		System.out.println(address+" "+ City);
		

	}
	
	

	public static void main(String[] args) {
		StaticVar sv = new StaticVar("Kiran", "India" );
		StaticVar sv1 = new StaticVar("Steve", "Sydney");
		sv.getData();
		sv1.getData();

	}

}
