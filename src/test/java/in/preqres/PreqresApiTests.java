package in.preqres;

import in.preqresHm21.colors.Data;
import in.preqresHm21.registration.Register;
import in.preqresHm21.registration.SuccessUserReg;
import in.preqresHm21.registration.UnsuccessUserReg;
import in.preqresHm21.spec.Specification;
import in.preqresHm21.users.UserData;
import in.preqresHm21.users.UserTime;
import in.preqresHm21.users.UserTimeResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.util.*;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PreqresApiTests {
    private final static String URL = "https://reqres.in/";

    @Test
    @DisplayName("Аватары содержат айди пользователей")
    public void checkAvatarContainsIdTest(){
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        List<UserData> users = given()
                .when()
                .get("api/users?page=2")
                .then()
                .log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        users.forEach(x-> Assertions.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assertions.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));

        List<String> realPeopleAvatars  = users.stream()
                .map(UserData::getAvatar)
                .collect(Collectors.toList());

        List<String> realPeopleIds = users.stream()
                .map(x->x.getId().toString())
                .collect(Collectors.toList());

        for (int i = 0; i<realPeopleAvatars.size(); i++){
            Assertions.assertTrue(realPeopleAvatars.get(i).contains(realPeopleIds.get(i)));
        }
    }

    @Test
    @DisplayName("Успешная регистрация")
    public void successUserRegTest(){
        Integer UserId = 4;
        String UserPassword = "QpwL5tke4Pnpja7X4";
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        Register user = new Register("eve.holt@reqres.in","pistol");
        SuccessUserReg successUserReg = given()
                .body(user)
                .when()
                .post("api/register")
                .then()
                .log().all()
                .extract().as(SuccessUserReg.class);
        Assertions.assertNotNull(successUserReg.getId());
        Assertions.assertNotNull(successUserReg.getToken());
        Assertions.assertEquals(UserId, successUserReg.getId());
        Assertions.assertEquals(UserPassword, successUserReg.getToken());
    }

    @Test
    @DisplayName("Не успешная регистрация")
    public void unSuccessUserRegTest(){
        Specification.installSpecification(Specification.requestSpec(URL),Specification.responseSpecError400());
        Register peopleSecond = new Register("sydney@fife","");
        UnsuccessUserReg unSuccessUserReg = given()
                .body(peopleSecond)
                .when()
                .post("/api/register")
                .then()  //.assertThat().statusCode(400) проверить статус ошибки, если не указана спецификация
                .log().body()
                .extract().as(UnsuccessUserReg.class);
        Assertions.assertNotNull(unSuccessUserReg.getError());
        Assertions.assertEquals("Missing password", unSuccessUserReg.getError());
    }

    @Test
    @DisplayName("Года правильно отсортированы")
    public void checkSortedYearsTest(){
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        List<Data> data = given()
                .when()
                .get("/api/unknown")
                .then()
                .log().all()
                .extract().body().jsonPath().getList("data", Data.class);

        List<Integer> dataYears = data.stream().map(Data::getYear).collect(Collectors.toList());
        List<Integer> sortedDataYears = dataYears.stream().sorted().collect(Collectors.toList());
        Assertions.assertEquals(dataYears, sortedDataYears);
        System.out.println(dataYears);
        System.out.println(sortedDataYears);
    }

    @Test
    @DisplayName("Удаление пользователя")
    public void deleteUserTest(){
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(204));
        given().when().delete("api/users/2")
                .then()
                .log().all();
    }

    @Test
    @DisplayName("Неверн запрос выдаления с телом")
    public void deleteWrongUser() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpec(400));
        given().when()
                .body("3")
                .delete("/api/users/2")
                .then()
                .log().all();
    }

    @Test
    @DisplayName("Flaky.Время сервера и компьютера совпадают")
    public void checkServerAndPcDateTest(){
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        UserTime user = new UserTime("morpheus","zion resident");
        UserTimeResponse response = given()
                .body(user)
                .when()
                .put("/api/users/2")
                .then().log().all()
                .extract().as(UserTimeResponse.class);

        String regex = "(.{5})$";
        String regexTwo = "(.{8})$";
        String currentTime = Clock.systemUTC().instant().toString().replaceAll(regexTwo,"");

        Assertions.assertEquals(currentTime,response.getUpdatedAt().replaceAll(regex,""));
  }

    @Test
    @DisplayName("Проверка обновления юзера")
        public void checkUpdatingData() {Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        UserTime user = new UserTime("morpheus","zion resident");

         given()
                .body(user)
                .when()
                .put("/api/users/2")
                .then().log().all()
                .body("name", equalTo(user.getName()))
                 .body("job",equalTo("zion resident"));
    }



}