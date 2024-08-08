import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import Files.Payload;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Validate add place is validated -- on go with these principles Given, when and then
		// Given - All input methods
		// When - Submit the API - Resource, HTTP methods
		// Then - Validate the Response
		// log().all()- to see the input and output and add in given and then

		// body("scope", equalTo("APP")) - used hamcrest.matchers to import
		// ADD Place-->Update place with new address-->get place to validate if the new
		// address is present or not

		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		String Response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Payload.Addplace())
//				.body("{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
//						+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Rahul Shetty Academy\",\r\n"
//						+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
//						+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n"
//						+ "    \"shoe park\",\r\n" + "    \"shop\"\r\n" + "  ],\r\n"
//						+ "  \"website\": \"http://rahulshettyacademy.com/\",\r\n" + "  \"language\": \"French-IN\"\r\n"
//						+ "}\r\n" + "")

				// we are validating the response so we are adding after the assertions

				.when().post("maps/api/place/add/json").then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)")
				// previous we have used console log to see response to see that in string we
				// can use extract().response().asString() -- and remove log.all
				.extract().response().asString();

		System.out.println(Response);
		JsonPath js = new JsonPath(Response); // for parsing Json
		String Placeid = js.getString("place_id");
		System.out.println(Placeid);

		// update place with new address
		String newAddress= "70 Summer walk, USA"; // DECLARING the new address in the body
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\""+Placeid+"\",\r\n"
						+ "\"address\":\""+newAddress+"\",\r\n" + "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
				.when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
//		get place to validate if the new address is present or not
		
		String GetResponse=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", "Placeid")
		.when().put("maps/api/place/get/json").then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		
		JsonPath js1 = new JsonPath(GetResponse); // for parsing Json
		String actualaddress = js1.getString("address");
		System.out.println(Placeid);
	}

}
