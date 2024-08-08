import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import Files.Payload;


public class SampleProgarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Validate if add place api is working as expected
		// Validate add place is validated -- on go with these principles Given, when
		// and then
		// Given - All input methods
		// When - Submit the API - Resource, HTTP methods
		// Then - Validate the Response
		
		// Add place--> Update the place with new address  -> Get place to see if new address is present or not in the response

		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		
		//Post Request -- Creating a new resource		
		String Response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
//		.body("{\r\n"
//				+ "  \"location\": {\r\n"
//				+ "    \"lat\": -38.383494,\r\n"
//				+ "    \"lng\": 33.427362\r\n"
//				+ "  },\r\n"
//				+ "  \"accuracy\": 50,\r\n"
//				+ "  \"name\": \"Rahul Shetty Academy\",\r\n"
//				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
//				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
//				+ "  \"types\": [\r\n"
//				+ "    \"shoe park\",\r\n"
//				+ "    \"shop\"\r\n"
//				+ "  ],\r\n"
//				+ "  \"website\": \"http://rahulshettyacademy.com/\",\r\n"
//				+ "  \"language\": \"French-IN\"\r\n"
//				+ "}\r\n"
//				+ "")
				.body(Payload.Addplace())
				.when().post("maps/api/place/add/json").then().assertThat().statusCode(200) //first  check the response
				.body("scope",equalTo("APP")).header("Server","Apache/2.4.52 (Ubuntu)")
				.extract().response().asString();//extract the response as string to extract that we need to create a variable (String Response).
				
				System.out.println(Response);
				
				JsonPath js= new JsonPath(Response); // Json path class takes string as input and convert to json to parse the json
				String Place_ID=js.getString("place_id");
				
				System.out.println(Place_ID);
				
				// Updating with new address so we use PUT method
				
				String newAddress="Summer walk, Australia";
				
				given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body("{\r\n"
						+ "\"place_id\":\""+Place_ID+"\",\r\n" //// here we need to take (Place_ID)from the post method as we are updating it and replace a413bd115e38c3feb074407ffac28933 with Place_ID
						//Replace //+ "\"address\":\"70 Summer walk, USA\",\r\n" with
						+ "\"address\":\""+newAddress+"\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n"
						+ "}\r\n"
						+ "")
				.when().put("maps/api/place/update/json")
				.then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));
				

				//Get place to see if new address is present or not in the response
		
				given().log().all().queryParam("key","qaclick123").queryParam("place_id", Place_ID).header("Content-Type","application/json")
				.when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).body("address", equalTo(newAddress));

	}

}
