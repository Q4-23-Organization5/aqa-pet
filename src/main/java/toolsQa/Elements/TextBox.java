package toolsQa.Elements;

import homework19AutoRiaRefactoring.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TextBox extends BasePage {

    public String email = "roberton@te.te";
    public TextBox(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement fullNameInput;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement emailInput;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddressArea;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    private WebElement permanentAddress;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//p[@id='email']")
    private WebElement emailResult;

    @FindBy(xpath = "//div[@id='Ad.Plus-970x250-2']")
    private WebElement scrollTo;

    public void sendName() {
        fullNameInput.sendKeys("Roberto Kusaka");
    }

    public void sendEmail() {
        emailInput.sendKeys(email);
    }

    public void sendAddress() {
        currentAddressArea.sendKeys("Brodyaha");
    }

    public void sendPermanent() {
        permanentAddress.sendKeys("Anastasia");
    }

    public void submit() {
        submitButton.click();
    }

    public void scrollDown() {
        new Actions(driver)
                .scrollToElement(scrollTo)
                .perform();
    }

    public String getEmailResult() {
        return emailResult.getText();
    }
}
