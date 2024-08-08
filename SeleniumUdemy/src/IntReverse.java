

public class IntReverse {
	public static void main(String[] args) {
//		int number = 54321;
//		int reverse = 0;
//		for (int i = 0; number != 0; number = number / 10) 
//		{
//			int remainder = number % 10;
//			reverse = reverse * 10 + remainder;
//		}
//		System.out.println("The reverse of the given number is: " + reverse);
		
		int number =123456789;
		int reverse=0;
		for(int i=0; number !=0;number=number/10)
		{
			int remainder=number%10;
			reverse= reverse*10 + remainder;
		}
		System.out.println("reverse of the number :"+ reverse );
		
		
		
		
	}
}


