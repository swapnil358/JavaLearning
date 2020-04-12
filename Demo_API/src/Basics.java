import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured. *;
import static org.hamcrest.Matchers	. *;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import files.ReUsableMethod;
import files.payLoad;

public class Basics {
	
	public static void main(String[] args) {
		

		// validate if ADD place API is working as expected
				
				
				//given, when, then
				
				
				//given -- all input details
				//when - submit API ---- resource, http method
				//then -  validate all response
		
		
		//validate if add place is working as expected
		//add place --- update place with new address ---> Get place to validate if new address is present in response
		
	
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(payLoad.AddPlace()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		
		System.out.println(response);	
		
		//add place --- update place with new address ---> Get place to validate if new address is present in response
		
		
		JsonPath js = new JsonPath(response);   // for parsing Json
		String placeId = js.getString("place_id");
		
		
		System.out.println("Place_id is: "+placeId);
		
		
		//Update place
		
		String newAddress = "Summer walk, africa";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+placeId+"\",\r\n" + 
				"\"address\":\""+newAddress+",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + "}\r\n" + 
				"}")
		.when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		
		//Get Place  ---> In get place, there no Json Body, everythng will be in URL. and query parater
		
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when().get("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1 = ReUsableMethod.rawToJson(getPlaceResponse);
		String actualAddress = js1.getString("address");
		
		System.out.println("Actual address is: "+actualAddress);
		Assert.assertEquals(actualAddress, newAddress);    //Assert on actaul and expected address
		
		
		
	}

}
