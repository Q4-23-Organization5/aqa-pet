package selenideTests.downloadUpload;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class UploadPage {

    File fileToUpload = new File("/Users/slavakosun/Desktop/env/aqa-pet/src/test/resources/screens/Image.PNG");

    public SelenideElement fileUploaded = $x("//div[@id='uploaded-files']");

    @Step
    public void openPage() {
        open("https://the-internet.herokuapp.com/upload");
    }

    @Step
    public void upload() {
        $x("//input[@id='file-upload']")
                .shouldBe(Condition.visible)
                .uploadFile(fileToUpload);
    }

    @Step
    public void submit() {
        $x("//input[@id='file-submit']").click();
    }
}
