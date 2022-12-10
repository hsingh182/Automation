package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetDemo {

	@Test
	public void getdetails() {
		
		Response response = given()
				            .contentType(ContentType.JSON)
				            .log()
				            .everything()
				            .expect()
				            .statusCode(200)
				            .when()
				            .get("https://reqres.in/api/users?page=1&email=janet.weaver@reqres.in");
		
		JsonPath js=new JsonPath(response.asString());
		
		String exp = "janet.weaver@reqres.in";
		
		int len = js.getInt("data.size()");
		System.out.println("Lenth of array :"+len);
	//	Assert.assertEquals(exp,act);
		
		for(int i=0; i<len; i++) {
			String act = js.getString("data["+i+"].email");
			
			System.out.println(act);
				
			}
		}
				     
	}

