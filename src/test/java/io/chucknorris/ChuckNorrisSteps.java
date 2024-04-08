package io.chucknorris;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ChuckNorrisSteps {

    private RequestSpecification spec;
    private RequestSpecification spec2;

    private List<Object> categories;
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
                .extract().statusCode();
  }
  @Then("^compare request$")
  public void getStatus() {
     Assertions.assertEquals(200,statusCode);
  }

  @Given("Set basic {string} URI")
  public void setBasicURIURI(String arg0) {
      spec2 =
              new RequestSpecBuilder()
                      .addFilter(new RequestLoggingFilter())
                      .addFilter(new ResponseLoggingFilter())
                      .setBaseUri(arg0)
                      .build();
  }

  @When("set request {string} path")
  public void setRequestParameter(String path) {
      categories =
              given()
                      .spec(spec2)
                      .when()
                      .get(path)
                      .then()
                      .extract().body().jsonPath().getList("");
  }

  @Then("compare available categories")
  public void compareAvailableCategories() {
    Assertions.assertTrue(categories.contains("food"));
  }
}
