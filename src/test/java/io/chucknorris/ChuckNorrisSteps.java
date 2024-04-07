package io.chucknorris;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import static io.restassured.RestAssured.given;

public class ChuckNorrisSteps {

    private RequestSpecification spec;
    private int statusCode;

  @Given("^put basic (.*) URI$")
  public void basic_url(String arg0) {
    spec =
        new RequestSpecBuilder()
            .addFilter(new RequestLoggingFilter())
            .addFilter(new ResponseLoggingFilter())
            .setBaseUri(arg0)
                .build();
  }

    @When("^get jokes by (.*) and (.*)$")
    public void addParam (String path, String categoria) {
        statusCode = given()
                .spec(spec)
                .queryParam("category",categoria)
                .when()
                .get(path)
                .then()
                .log().all()
                .extract().response().statusCode();
    }

    @Then("compare request")
    public void getStatus() {
        Assertions.assertEquals(200,statusCode);
    }

}
