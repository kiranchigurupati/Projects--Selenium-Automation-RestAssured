package CoreJava2;

public class Exceptions {

	public static void main(String[] args) {
		 int a = 5;
		 int b= 0;
		 try
		 {
			int c= a/b;
			System.out.println(c);
		 }catch (Exception e)// universal exception
		 {
			 
				System.out.println("error");

		 }
	}

}
