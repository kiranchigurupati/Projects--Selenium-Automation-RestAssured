
public class PalindromeString {

	public static void main(String[] args) {
		String str= "civic";
		String Revstr ="";
		
		int strlength= str.length();
		
		for(int i =(str.length()-1);i>=0;i--)
			Revstr = Revstr + str.charAt(i);
		{
			if(str.toUpperCase().equals(Revstr.toUpperCase()))
			{
				System.out.println( str +": Is a plaindrome");
			}
			else
			{
				System.out.println( str +"Is not a a plaindrome");
			}
			
		}
	}

}
