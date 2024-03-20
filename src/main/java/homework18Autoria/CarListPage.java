package homework18Autoria;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CarListPage {
    private final WebDriver driver;
    public CarListPage(WebDriver driver) {
        this.driver = driver;
    }

    public String findVinCod() {
        String vinResult = "Y6DSF69YE8W041095";
        driver.findElement((By.xpath("//span[text()=' Y6DSF69YE8W041095 ']")));
        return vinResult;
    }

    public String getCarNumber() {
        String carNumber = "AO2475EO";
        try{
            driver.findElement(By.xpath("//span[@class='state-num ua' and text()=' AO 2475 EO ']"));
        } catch (NoSuchElementException ex) {
            System.out.println("The car was not found");
        }

        return carNumber;
    }

    public void clickOnCar() {
        driver.findElement(By.xpath("//a[@title='Седан Chevrolet Aveo 2009 в Сваляві']")).click();
    }

}
