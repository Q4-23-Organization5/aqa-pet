package org.learn.homework_17;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Herokuapp {
  private WebDriver driver;
  private String innerElement;
  @BeforeEach
  public void initBrowser() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
  }

  @Test
  public void positiveTest() throws InterruptedException {
    String checkText = "You logged into a secure area!";

    driver.get("https://the-internet.herokuapp.com/login");
    driver
        .findElement(By.xpath("//div[@class='large-6 small-12 columns']//input[@id='username']"))
        .sendKeys("tomsmith");
    driver
        .findElement(By.xpath("//div[@class='large-6 small-12 columns']//input[@id='password']"))
        .sendKeys("SuperSecretPassword!");
    WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));

    loginButton.click();

    WebElement authResult = driver.findElement(By.xpath("//div[@id='flash']"));

    JavascriptExecutor js = (JavascriptExecutor) driver;

    try {
      innerElement =
          js.executeScript("return arguments[0].firstChild.textContent", authResult)
              .toString()
              .trim();
      System.out.println(innerElement);
    } catch (StaleElementReferenceException exception) {
      innerElement =
          js.executeScript("return arguments[0].firstChild.textContent", authResult)
              .toString()
              .trim();
      System.out.println(innerElement);
    }

    Assertions.assertEquals(checkText, innerElement);
  }

  @Test
  public void negativeTest() throws InterruptedException {
    String checkText = "Your password is invalid!";

    driver.get("https://the-internet.herokuapp.com/login");
    driver
        .findElement(By.xpath("//div[@class='large-6 small-12 columns']//input[@id='username']"))
        .sendKeys("tomsmith");
    driver
        .findElement(By.xpath("//div[@class='large-6 small-12 columns']//input[@id='password']"))
        .sendKeys("SuperSecretPassword");
    WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));

    loginButton.click();

    WebElement authResult = driver.findElement(By.xpath("//div[@id='flash']"));

    JavascriptExecutor js = (JavascriptExecutor) driver;

    try {
      innerElement =
          js.executeScript("return arguments[0].firstChild.textContent", authResult)
              .toString()
              .trim();
      System.out.println(innerElement);
    } catch (StaleElementReferenceException exception) {
      innerElement =
          js.executeScript("return arguments[0].firstChild.textContent", authResult)
              .toString()
              .trim();
      System.out.println(innerElement);
    }

    Assertions.assertEquals(checkText, innerElement);
  }

  @AfterEach
  public void closeDriver() {
    if (driver != null) {
      driver.quit();
    }
  }
}
