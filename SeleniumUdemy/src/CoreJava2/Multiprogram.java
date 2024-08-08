package CoreJava2;

public class Multiprogram {

	public static void main(String[] args) {
//		int k=1;
//		for(int i=0;i<=5;i++)  // Top-down Program in decrement fashion  1234 567 89 10
//		{
//			for(int j=1;j<5-i;j++)
//			{
//			System.out.print(k);
//			k++;	
//			}
//			System.out.println(" ");
		
		
//		for(int i=1;i<=5;i++)  // Top-down in increment fashion 
//		{
//			for(int j=1;j<i;j++)
//			{
//				System.out.print(k);
//				k++;
//			}
//			System.out.println(" ");
//		}
//		}
		for(int i=1;i<5;i++) // 1 12 123 1234 type
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j); 
			}
			System.out.println();
		}
		
	}

}
