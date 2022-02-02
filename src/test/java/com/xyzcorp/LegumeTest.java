package com.xyzcorp;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LegumeTest {
    
    //Rest-Assured
    // [{"description":"Winter fruit","name":"Apple"},
    //  {"description":"Tropical fruit","name":"Pineapple"}]
    @Test
    public void testGetLegume() {
                given()
                .relaxedHTTPSValidation()
                .accept(ContentType.JSON)
                .when()
                .get("https://staging.tiered-planet.net/mild-temper/legumes")
                .then()
                .assertThat()
                .body("[1].name", equalTo("Zucchini"));
    }
}
