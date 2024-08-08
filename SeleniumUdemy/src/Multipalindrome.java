
public class Multipalindrome {

	public static void main(String[] args) {

		int n = 131, r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}

//		String str = "Kiran";				//String Palindrome
//		String Revstr = "";
//		int strLength = str.length();
//
//		for (int i = str.length() - 1; i >= 0; i--)
//			Revstr = Revstr + str.charAt(i);
//		{
//			if (str.toLowerCase().equals(Revstr.toLowerCase())) {
//				System.out.println(str + ":Is a Palindrome");
//
//			}
//			else
//			{
//				System.out.println(str + ":Is not a Palindrome");
//
//			}
//
//		}
}
