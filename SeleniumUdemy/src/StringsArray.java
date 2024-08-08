
public class StringsArray {

	public static void main(String[] args) {
		String s = "Kiran";
		String s1 ="Cognizant";
//		String s2 ="Cognizant"; - It will redirect to the previous variable s1 and doesn't create a memory;
		//but in selenium we majorly we use this type
		
		String s2 = new String("Welcome");
		String s3 = new String("Udemy");
//		String s4 = new String("Welcome"); - It will create a new memory since we are using new to create an object

//		String s5 = "Welcome to the Course";- multiple strings leads to create an array 
//		Split method
		String s5 = "Welcome to JavaCourse";
		String[] splittedstring = s5.split(" ");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
//		System.out.println(splittedstring[2].trim());
		
//		 for(int i=0;i<s5.length();i++)
//         {
//           System.out.println(s5.charAt(i));
//        }
        for(int i=s5.length()-1;i>=0;i--)
         {
           System.out.println(s5.charAt(i)); 
         }


		
	}

}
