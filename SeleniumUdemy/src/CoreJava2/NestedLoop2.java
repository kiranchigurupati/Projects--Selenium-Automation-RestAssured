package CoreJava2;

public class NestedLoop2 {

	public static void main(String[] args) {
		int k=1;
		for(int i=0;i<=5;i++)//Outer forloop  1234 567 89 10
		{
//		System.out.println("Outerloop");
		
		for(int j=1;j<5-i;j++)
		{
			System.out.print(k);
			k++;
		}
		System.out.println(" ");
		
		}

	}

}
