package com.dnylpz.apiDemo;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@SpringBootTest()
class ApiDemoApplicationTests {
	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Test
	public void testAppIsRunning() {
		// Test code
		//RestAssured.baseURI = appUrl;
		//Response res = RestAssured.when().get("/greeting");
		//res.then().statusCode(200);
		assert 200!=200;
		//System.out.println(res.statusCode());
	}

}
