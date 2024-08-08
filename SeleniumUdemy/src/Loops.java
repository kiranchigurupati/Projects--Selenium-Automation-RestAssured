import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loops {

	public static void main(String[] args) {
		
		int[] arr2= {2,28,30,35,90,23,45,78,89};
//		System.out.println(arr2[0]);
	
//		multiple of 2 program
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr2 [2]);
		if(arr2[i]% 2==0)
		{
			System.out.println(arr2[i]);		}
		else
		{
		System.out.println(arr2[i]+"Not divisible by 2");
		}
		
		
		ArrayList<String> a = new ArrayList<String>(); 
		a.add("Kiran");
		a.add("Chigurupati");
		a.add("TA");
		a.add("Cognizant");
		System.out.println(a.get(2));
		
		for(int i1=0;i1<a.size();i1++) //size declares memory
		{
			System.out.println(a.get(2));
		}
		System.out.println("$%%^^&&&&&");
		for(String Var:a)
		{
			System.out.println(Var);	
		}
		System.out.println(a.contains(arr2));	
		
		String[] letter1 = {"Kiran","Ch","TA"};
		List<String> nameletter1 =Arrays.asList("Kiran");
		nameletter1.contains("Kiran");
		


		}
	}
	
	

}
