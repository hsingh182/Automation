package utils;

import java.util.Map;

import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Helper {

	public static Response getcall(String url,Map<String,String> queryparam,int statuscode) {
		
		Response res = given()
				       .contentType(ContentType.JSON)
				       .queryParams(queryparam)
				       .log()
				       .everything()
				       .expect()
				       .statusCode(statuscode)
				       .log()
				       .ifError()
				       .when()
				       .get(url);
		
		return res;
	}
}
