import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

public class JiraBug {

	public static void main(String[] args) {
		 RestAssured.baseURI="https://samchandler856.atlassian.net";
		 String Response=given().header("Content-Type","application/json")
		 .header("Authorization","Basic c2FtY2hhbmRsZXI4NTZAZ21haWwuY29tOkFUQVRUM3hGZkdGME85OXBGMzAtZUdDMVBoZkJaZ3pvUXNRelJxSWpEeVNmMG1TVjdTWEFSUWRoNVNRYkNpVDliaEhTdG0zbDRnNXpycXJfQlJvQ3otVkV3cU1xQTB0Vi1Uc0ZNelFoMmY2cTBNUjJYb0h5MzBEWlZaWFlpc0JsZ2lqNFdxTjRpejV5WWxMc3F6bGduTjdoQV9hVjFGZ2xDcGJPdmJScmRlMXh3SlhJcGstbFRoTT05RDY4RkJDQg==")
		 .body("{\r\n"
		 		+ "    \"fields\": {\r\n"
		 		+ "       \"project\":\r\n"
		 		+ "       {\r\n"
		 		+ "          \"key\": \"SCRUM\"\r\n"
		 		+ "       },\r\n"
		 		+ "       \"summary\": \"Links are not working - Automation\",\r\n"
		 		+ "       \"issuetype\": {\r\n"
		 		+ "          \"name\": \"Bug\"\r\n"
		 		+ "       }\r\n"
		 		+ "   }\r\n"
		 		+ "}\r\n"
		 		+ "")
		 .log().all()
		 .when().post("rest/api/2/issue")
		 .then().log().all().assertThat().statusCode(201)
		 .extract().response().asString();
		 
		 
		 JsonPath js= new JsonPath(Response);
		 String id =js.getString("id");
		 System.out.println(id);
		 
		 given().header("X-Atlassian-Token","no-check").pathParam("key", id)
		 .header("Authorization","Basic c2FtY2hhbmRsZXI4NTZAZ21haWwuY29tOkFUQVRUM3hGZkdGME85OXBGMzAtZUdDMVBoZkJaZ3pvUXNRelJxSWpEeVNmMG1TVjdTWEFSUWRoNVNRYkNpVDliaEhTdG0zbDRnNXpycXJfQlJvQ3otVkV3cU1xQTB0Vi1Uc0ZNelFoMmY2cTBNUjJYb0h5MzBEWlZaWFlpc0JsZ2lqNFdxTjRpejV5WWxMc3F6bGduTjdoQV9hVjFGZ2xDcGJPdmJScmRlMXh3SlhJcGstbFRoTT05RDY4RkJDQg==")
		 .multiPart("file",new File("C://Users//853523//OneDrive - Cognizant//Pictures//success1.PNG")).log().all()
		 .when().post("rest/api/3/issue/{key}/attachments")
		 .then().log().all().assertThat().statusCode(200);
	}

}
