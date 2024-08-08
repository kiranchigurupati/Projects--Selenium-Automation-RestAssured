package OAAuth;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.List;

import POJO.APIcourses;
import POJO.GetCourse;

public class OAAuthorization {

	public static void main(String[] args) {
//		RestAssured.baseURI="https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token";
		String Response = given().log().all()
				.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W").formParam("grant_type", "client_credentials")
				.formParam("scope", "trust").when().log().all()
				.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
		System.out.println(Response);

		JsonPath Js = new JsonPath(Response); // Parsing the Data
		String AT = Js.getString("access_token");// store the token in a Variable

		// String Response2 =
		GetCourse gc = given().queryParam("access_token", AT).when()
				.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
				// .asString();
//				System.out.println(Response2);
				.as(GetCourse.class); // Calling from other package
		System.out.println(gc.getLinkedIn());
		System.out.println(gc.getInstructor());
		System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());

		List<APIcourses> apiCourses = gc.getCourses().getApi();
		for (int i = 0; i < apiCourses.size(); i++) {
			if (apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing")) {
				System.out.println(apiCourses.get(i).getPrice());
			}
		}

	}

}
