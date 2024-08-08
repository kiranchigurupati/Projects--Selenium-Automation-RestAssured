import Files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		JsonPath js= new JsonPath(Payload.Complex());
		
		//Print No of courses returned by API
		
		int courses =js.getInt("courses.size()"); // count is in Int format --->size() is a method used in json path and applied only to an array
		System.out.println(courses);
		
		//Print Purchase Amount
		
		int Purchase=js.getInt("dashboard.purchaseAmount");
		System.out.println(Purchase);
		
		//Print Title of the first course
		String firstcourseTitle=js.get("courses[0].title"); //Get method will default used for string
		System.out.println(firstcourseTitle);

		//Print All course titles and their respective Prices
		for(int i=0;i<courses;i++) //i is a variable to write a variable in between the string we use "+i+"
		{
			String courseTitles=js.get("courses["+i+"].title");
			System.out.println(js.get("courses["+i+"].price").toString()); //println always expect string argument so to convert in to string we use .toString()
			System.out.println(courseTitles);
		}
		System.out.println("Print no of copies sold by RPA Course");
		
		for(int i=0;i<courses;i++)
		{
			String courseTitles=js.get("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("RPA"))
			{
				int copies=js.get("courses["+i+"].copies");
				System.out.println(copies);
				break;
			}
		}
	}

}
