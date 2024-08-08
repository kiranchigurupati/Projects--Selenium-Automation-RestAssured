
public class CoreJava {

	public static void main(String[] args) {

		// Data Types and Variables

//		int num =5;
//		String letter ="Kiran";
//		Double K =6.7;
//		char number='r';
//		System.out.println(num);
//		
		// Arrays
		// int[] arr = new int[5];
		// arr[0] = 1;
		// arr[1] = 2;

//		int[] arr2= {2,28,30,35,90,23,45,78,89};
//		System.out.println(arr2 [0]);
//		
//		for(int i=0;i<arr2.length;i++)
//		{
//			System.out.println(arr2[i]);
//		}

		String[] letter = { "Kiran", "Ch", "TA" };
		for (int i = 0; i < letter.length; i++) {
			System.out.println(letter[i]);
		}

		for (String k : letter) {
			System.out.println(k);
		}
	}

}
