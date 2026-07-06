package testSuite;

import org.testng.annotations.Test;

import entities.user;

import static io.restassured.RestAssured.given;

import java.util.List;

import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;

public class fancodeuser {

	@Test
	public void users() {
		Response res = given().
				contentType("application/json").baseUri("https://jsonplaceholder.typicode.com/users").when().get().then().extract().response();
		
		System.out.println(res.asString());
		
		List<user> userdata = res.as(new TypeRef<List<user>>() {});
		System.out.println(userdata.size());
		
		System.out.println("_____________________________________________________________");
		
		for(int i=0;i<userdata.size();i++) {
			System.out.println(userdata.get(i).getname());
		}
		
		System.out.println("_____________________________________________________________");
		
		for (user u : userdata) {
            System.out.println(u.getaddress().getCity());
        }
		
		
		 
	}
}
