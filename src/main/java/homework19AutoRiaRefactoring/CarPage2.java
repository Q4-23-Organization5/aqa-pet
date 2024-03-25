package homework19AutoRiaRefactoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CarPage2 extends BasePage{

    public CarPage2(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='size18'and text()='89']")
    private WebElement mileage;

    @FindBy(xpath = "//section[@id='userInfoBlock']//div[text()=' Ярослав']")
    private WebElement seller;

    public String checkMileage() {
       return mileage.getText();
    }

    public String getSellerName() {
        return seller.getText();
    }

}
