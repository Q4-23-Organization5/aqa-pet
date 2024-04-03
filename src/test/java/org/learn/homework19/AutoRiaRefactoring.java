package org.learn.homework19;

import homework14.loger.StartGame;
import homework19AutoRiaRefactoring.CarListPage2;
import homework19AutoRiaRefactoring.CarPage2;
import homework19AutoRiaRefactoring.HomePage2;
import driverfactory.BrowserFactory;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static io.qameta.allure.SeverityLevel.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@DisplayName("AutoRia UI Tests")
public class AutoRiaRefactoring {

    private WebDriver driver;
    private JavascriptExecutor js;
    private HomePage2 homePage2;
    private CarListPage2 carListPage2;
    private CarPage2 carPage2;
    final Logger logger = LogManager.getLogger(StartGame.class);
    @BeforeEach
    public void initBrowser() {
        driver = BrowserFactory.getDriver("FIREFOX");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().fullscreen();
        logger.info("Driver {} is initialized", driver);
        js = (JavascriptExecutor) driver;

        homePage2 = new HomePage2(driver);
        carListPage2 = new CarListPage2(driver);
        carPage2 = new CarPage2(driver);
        logger.info("Pages is initialized");

        homePage2.openPage();
    }

    @AfterEach
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    @DisplayName("Find Car By Filter")
    @Severity(BLOCKER)
    public void findCarByFilters () {
        homePage2.chooseCategories("1");
        logger.info("Categories is selected");
        homePage2.chooseBrand();
        logger.info("Brand is selected");
        homePage2.chooseModel("Aveo");
        logger.info("Model is choose");
        homePage2.chooseRegion("Закарпатська обл");
        logger.info("Region is selected");
        homePage2.chooseYearsRange("2009","2010");
        logger.info("Years Rang is selected");
        homePage2.submit(js);
        logger.info("Go to List Page2");

        carListPage2.findVinCod();

        assertThat(carListPage2.findVinCod(), equalToIgnoringWhiteSpace("Y6DSF69YE8W041095"));
    }

    @Test
    @DisplayName("Check car by name")
    @Severity(CRITICAL)
    public void checkCarByNumber() {
        logger.info("checkCarByNumber starts");
        homePage2.chooseCategories("1");
        logger.info("Category is selected");
        homePage2.chooseBrand();
        logger.info("Brand is selected");
        homePage2.chooseModel("Aveo");
        logger.info("Model is selected");
        homePage2.chooseRegion("Закарпатська обл");
        logger.info("Region is selected");
        homePage2.chooseYearsRange("2009","2010");
        logger.info("Time rang is selected");
        homePage2.submit(js);
        logger.info("Submit");
        carListPage2.getCarNumber();
        logger.info("Number is found");


        assertThat(carListPage2.getCarNumber(),is("AO2475EO"));
    }

    @Test
    @DisplayName("The submit button is present")
    public void submitPresent() {
        homePage2.openPage();
        homePage2.submitPresent();

        assertThat(homePage2.submitPresent(),equalToIgnoringWhiteSpace("Пошук"));
    }


    @Test
    @DisplayName("Check mileage of auto")
    @Severity(CRITICAL)
    public void checkMileage() {
        homePage2.openPage();
        homePage2.chooseCategories("1");
        homePage2.chooseBrand();
        homePage2.chooseModel("Aveo");
        homePage2.chooseRegion("Закарпатська обл");
        homePage2.chooseYearsRange("2009","2010");
        homePage2.submit(js);
        carListPage2.clickOnCar();
        carPage2.checkMileage();

        assertThat(carPage2.checkMileage(),equalTo("89"));
    }

    @Test
    @Severity(NORMAL)
    @DisplayName("Check seller name")
    public void checkSellerName() {
        homePage2.openPage();
        homePage2.chooseCategories("1");
        homePage2.chooseBrand();
        homePage2.chooseModel("Aveo");
        homePage2.chooseRegion("Закарпатська обл");
        homePage2.chooseYearsRange("2009", "2010");
        homePage2.submit(js);
        carListPage2.clickOnCar();

        assertThat(carPage2.getSellerName(),equalToIgnoringWhiteSpace("Ярослав"));
    }

}
