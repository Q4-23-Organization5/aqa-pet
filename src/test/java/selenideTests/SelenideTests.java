package selenideTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import selenideTests.downloadUpload.DownloadPage;
import selenideTests.downloadUpload.UploadPage;
import selenideTests.dynamicElements.Example1;
import selenideTests.dynamicElements.Example2;
import java.io.File;

@DisplayName("UI Test by Selenide")
public class SelenideTests {
    @BeforeEach
    public void beforeEach() {
        Configuration.downloadsFolder="/Users/slavakosun/Desktop/env/aqa-pet/src/test/resources/downloads";
    }

    @Test
    @DisplayName("Download File Test")
    public void downloadFile() {
        DownloadPage downloadPage = new DownloadPage();
        File file = new File(downloadPage.filePath);
        downloadPage.openDownloadPage();
        downloadPage.downloadButton();

        Assertions.assertTrue(file.exists());
    }

    @Test
    @DisplayName("Upload File test")
    public void uploadFile() {
        UploadPage uploadPage = new UploadPage();
        uploadPage.openPage();
        uploadPage.upload();
        uploadPage.submit();

        Assertions.assertTrue(uploadPage.fileUploaded.getText().contains("Image.PNG"));
    }

    @Test
    @DisplayName("Dynamic Element P1")
    public void exampleOne() {
        Example1 example1 = new Example1();
        example1.openExampleOne();
        example1.clickStart();

        Assertions.assertTrue(example1.result().getText().contains("Hello World!"));
    }

    @Test
    @DisplayName("Dynamic Element P2")
    public void exampleTwo() {
        Example2 example2 = new Example2();
        example2.openExample2();
        example2.start();

        Assertions.assertTrue(example2.result().getText().contains("Hello World!"));
    }
}
