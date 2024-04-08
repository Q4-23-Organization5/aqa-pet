package homework19AutoRiaRefactoring;

import homework14.loger.StartGame;
import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CarListPage2 extends BasePage{

    final Logger logger = LogManager.getLogger(StartGame.class);

    public CarListPage2(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[text()=' Y6DSF69YE8W041095 ']")
    private WebElement vinCod;
    @FindBy(xpath = "//span[@class='state-num ua' and text()=' AO 2475 EO ']")
    private WebElement carNumber;
    @FindBy(xpath = "//a[@title='Седан Chevrolet Aveo 2009 в Сваляві']")
    private WebElement carButton;

    @Step
    public String findVinCod() {
        String vinResult = "Y6DSF69YE8W041095";
        vinCod.isDisplayed();
        logger.debug("vinCod is found");
        return vinResult;
    }

    @Step
    public String getCarNumber() {
        String number = "AO2475EO";
        try{
            carNumber.isDisplayed();
            logger.debug("Car number is found");
        } catch (NoSuchElementException ex) {
            logger.debug("Is not found");
        }
        return number;
    }

    @Step
    public void clickOnCar() {
        carButton.click();
        logger.debug("Car button is found");
    }

}
