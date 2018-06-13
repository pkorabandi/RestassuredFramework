package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetCallBDD {
	@Test
	public void test_numberOfCircuits2017() {
//		  given().
//		  when().
//		  then().
//		  assert()
		
		given().
			when().get("http://ergast.com/api/f1/2017.json").
			then().
				assertThat().
				body("MRData.RaceTable.Races.round", hasSize(20));
	}

}
