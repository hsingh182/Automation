package testcases;

import org.testng.annotations.Test;

import generics.Constant;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import mappers.Headers;
import utils.Helper;

public class Testcaseuserdetails {

	
	@Test
	public void getuserdetails() {
		
		Response response= Helper.getcall(Constant.baseurl+Constant.userendpoint, Headers.getquery(), 200);
		
		System.out.println(response.asString());
		
		JsonPath js=new JsonPath(response.asString());
		
		int len = js.getInt("data.size()");
		System.out.println(len);
		
		for(int i=0; i<len; i++) {
			
			if(js.getString("data["+i+"].first_name").equalsIgnoreCase("Byron")) {
			
			System.out.println(js.get("data["+i+"].id"));
			}
		}
	}
	
	
}
