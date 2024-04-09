package selenideTests.downloadUpload;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class DownloadPage {
    public String filePath = "/Users/slavakosun/Desktop/env/aqa-pet/src/test/resources/downloads/";

    @Step
    public void openDownloadPage() {
        open("https://the-internet.herokuapp.com/download");
    }

    @Step
    public void downloadButton() {
           $x("//a[@href='download/Image.PNG']").shouldBe(visible).download();
    }

}
