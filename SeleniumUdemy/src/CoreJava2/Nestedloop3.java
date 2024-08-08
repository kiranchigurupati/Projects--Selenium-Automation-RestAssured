package CoreJava2;

public class Nestedloop3 {

	public static void main(String[] args) {  // 1 23 456 78910
		int k=1;
		for(int i=1;i<5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.println(k);
				//System.out.println("\t");
				k++;
			}
			System.out.println(" ");
			
		}

	}

}
