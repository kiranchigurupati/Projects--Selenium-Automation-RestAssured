package CoreJava2;

public class Reverseofstring {

	public static void main(String[] args) {
		String S1 = "Dream BIG";
		String revstr = "";
		
		for(int i=S1.length()-1;i>=0;i--)
		{
//			System.out.println("Print in Reverse");
			revstr= revstr + S1.charAt(i);
		}
		System.out.println("Print in Reverse: "+ revstr);
	}



}
//public void name()
//{
//	
//	System.out.println("Print in Reverse");
//
//}
	

