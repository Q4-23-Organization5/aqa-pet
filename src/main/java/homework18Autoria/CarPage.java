package homework18Autoria;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarPage {
    private final WebDriver driver;

    public CarPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkMileage() {
       return driver.findElement(By.xpath("//span[@class='size18'and text()='89']")).getText();
    }

    public String getSellerName() {
        return driver.findElement(By.xpath("//section[@id='userInfoBlock']//div[text()=' Ярослав']")).getText();

    }

}
