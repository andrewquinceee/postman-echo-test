package ru.netology.postman;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {
    @Test
    void shouldReturnSentData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .body("data", equalTo("WRONG DATA")); // <-- СЛОМАЛИ!
    }
}
