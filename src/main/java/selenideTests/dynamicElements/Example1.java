package selenideTests.dynamicElements;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Example1 {

    @Step
    public void openExampleOne() {
        open("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    @Step
    public void clickStart() {
        $x("//button[text()='Start']").click();
    }

    @Step
    public SelenideElement result() {
        SelenideElement helloWorld = $x("//h4[text()='Hello World!']").shouldBe(appear);
        return helloWorld;
    }
}
