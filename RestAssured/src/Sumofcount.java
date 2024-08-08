import org.testng.Assert;
import org.testng.annotations.Test;

import Files.Payload;
import io.restassured.path.json.JsonPath;

public class Sumofcount {
	@Test
	public void sumofcourses() {
		int sum = 0;
		JsonPath js = new JsonPath(Payload.Complex());
		int courses = js.getInt("courses.size()"); // count is in Int format --->size() is a method used in json path
													// and applied only to an array

		for (int i = 0; i < courses; i++) {
			int price = js.get("courses[" + i + "].price");
			int copies = js.get("courses[" + i + "].copies");
			int amount = price * copies;
			System.out.println(amount);
			sum = sum + amount;

		}
		System.out.println(sum);
		int purchaseamount = js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, purchaseamount);
	}
}
