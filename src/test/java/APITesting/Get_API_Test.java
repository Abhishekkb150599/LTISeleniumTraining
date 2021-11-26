package APITesting;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

public class Get_API_Test {

//	@SuppressWarnings("static-access")
//	@Test
//	public void get_Test() {
//		RestAssured request = new RestAssured();
//		Response response = request.get("https://reqres.in/api/users?page=2");
//		System.out.println(response.body());
//		System.out.println(response.getBody());
//		System.out.println(response.getBody().asString());	
//	}

	@Test
	public void get_Test_BDD() {
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			//.body("data.first_name",hasItems("Michael"))
			.body("data.id[0]", equalTo(7))
			.log().all();
	}

}
