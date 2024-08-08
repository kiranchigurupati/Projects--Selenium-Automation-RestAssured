import java.util.ArrayList;

import org.testng.annotations.Test;

public class Test1 {
//	@Test // Declare @Test before the method
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alpha");
		names.add("Beta");
		names.add("Abhi");
		names.add("Kiran");
		names.add("Alekhya");

		int count = 0;// to count the names

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}

		}
		System.out.println(count);
	}

	@Test
	public void StreamsFilter() 
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alpha");
		names.add("Beta");
		names.add("Abhi");
		names.add("Kiran");
		names.add("Alekhya");
		
		Long L=names.stream().filter(k-> k.startsWith("A")).count();
		System.out.println(L);
	
	}

}
