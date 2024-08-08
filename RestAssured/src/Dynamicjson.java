import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Dynamicjson {

	@Test(dataProvider = "booksdata")
	public void Dj(String isbn, String aisle) // Declare the variables here in order to access the Parameters
	{
		RestAssured.baseURI = "http://216.10.245.166";
		String Dynamic = given().log().all().header("Content-Type", "application/json")
				.body(Payload.Library(isbn, aisle)).when().post("Library/Addbook.php").then().log().all().assertThat()
				.statusCode(200).extract().response().asString();

		System.out.println(Dynamic);

	}

	@DataProvider(name = "booksdata") // Multi D-array -- link the @DataProvider array to the @Test
	public Object[][] getData() {
		return new Object[][] { { "fegy", "324234" }, { "wefsdf", "235235" } };
	}

}
