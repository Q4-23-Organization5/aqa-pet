package selenideTests.dynamicElements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Example2 {

    @Step
    public void openExample2() {
        open("https://the-internet.herokuapp.com/dynamic_loading/2");
    }

    @Step
    public void start() {
        $x("//button[text()='Start']").click();
    }

    @Step
    public SelenideElement result() {
        SelenideElement helloWorld = $x("//h4[text()='Hello World!']").shouldBe(appear);
        return helloWorld;
    }
}
