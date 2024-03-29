package in.preqres;

import in.preqresHm21.UserData;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class PreqresApiTests {
    private static final String URL = "https://reqres.in/";



    @Test
    public void firstApiTest() {
        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .baseUri(URL)
                .get("/api/users?delay=3")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        users.forEach(x -> Assertions.assertTrue(x.getAvatar().contains(x.getId().toString())));

        Assertions.assertTrue(users.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));
        int a = 3;


    }

}
