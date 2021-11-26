package APITesting;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Post_API_Test {

	@Test
	public void post_API() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Ajay");
		map.put("job", "Trainer");
		System.out.println("Printing Map " + map);
		
		JSONObject requestBody = new JSONObject(map);
		System.out.println("Printing Request Body "+ requestBody);
		System.out.println("Printing Request Body as String "+ requestBody.toJSONString());
		
		//below is an example of creating JSON request
		//without using Map
		JSONObject newBody = new JSONObject();
		newBody.put("name", "Ajay");
		newBody.put("job", "Trainer");
		
		
		//now we can create the request
		given()
		//	.headers("content-type", "application/json")
			.body(newBody.toJSONString())
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201);
	}
}
