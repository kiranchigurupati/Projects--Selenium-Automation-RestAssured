package CoreJava2;

public class ChildSuper extends Parentsuper {

	String name = "Chigurupati";

	public void GetData() {
		System.out.println(name);
		System.out.println(super.name); // super keyowrd is used to print the Data from parent class
		// Priority is always to the local variable if we initiate any method

	}

	public ChildSuper() // constructor using super keyword
	{
		super();
		System.out.println("Small one");
	}

	public static void main(String[] args) {

		ChildSuper cs = new ChildSuper();
		cs.GetData();
		cs.ParentData();
		// TODO Auto-generated method stub
	}

}
