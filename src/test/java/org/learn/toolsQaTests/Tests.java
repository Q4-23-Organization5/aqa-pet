package org.learn.toolsQaTests;

import driverfactory.BrowserFactory;
import homework14.loger.StartGame;
import jdk.jfr.Category;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import toolsQa.Elements.CheckBox;
import toolsQa.Elements.TextBox;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Tests {

    WebDriver driver;
    TextBox textbox;
    CheckBox checkBox;
    final Logger logger = LogManager.getLogger(StartGame.class);


    @BeforeEach
    public void initBrowser() {
        driver = BrowserFactory.getDriver("CHROME");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().maximize();
        textbox = new TextBox(driver);
        checkBox = new CheckBox(driver);
    }

    /*@AfterEach
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }*/

    @Test
    public void textBoxTest() {
        driver.get("https://demoqa.com/text-box");
        textbox.sendName();
        textbox.sendEmail();
        textbox.sendAddress();
        textbox.sendPermanent();
        textbox.scrollDown();
        textbox.submit();
        assertThat(textbox.getEmailResult().contains("roberton@te.te"),is(true));
        logger.info(textbox.getEmailResult().contains("roberton@te.te"));
    }

    @Test
    public void checkBoxTest() {
        checkBox.getPage();
        checkBox.unfoldParent();
    }







}
