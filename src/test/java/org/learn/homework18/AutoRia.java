package org.learn.homework18;

import homework18Autoria.CarListPage;
import homework18Autoria.CarPage;
import homework18Autoria.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;


import java.time.Duration;

public class AutoRia {

  public WebDriver driver = new ChromeDriver();
  private final HomePage homePage = new HomePage(driver);
  private final CarListPage carListPage = new CarListPage(driver);
  private final CarPage carPage = new CarPage(driver);

  JavascriptExecutor js;

  @BeforeEach
  public void initBrowser() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        js = (JavascriptExecutor) driver;

  }

  @Test
  public void findCarByFilters () {
      homePage.openPage();
      homePage.chooseCategories("1");
      homePage.chooseBrand();
      homePage.chooseModel("Aveo");
      homePage.chooseRegion("Закарпатська обл");
      homePage.chooseYearsRange("2009","2010");
      homePage.submit(js);
      carListPage.findVinCod();

      assertThat(carListPage.findVinCod(), equalToIgnoringWhiteSpace("Y6DSF69YE8W041095"));
  }

  @Test
  public void checkCarByNumber() {
      homePage.openPage();
      homePage.chooseCategories("1");
      homePage.chooseBrand();
      homePage.chooseModel("Aveo");
      homePage.chooseRegion("Закарпатська обл");
      homePage.chooseYearsRange("2009","2010");
      homePage.submit(js);
      carListPage.getCarNumber();

      assertThat(carListPage.getCarNumber(),is("AO2475EO"));
  }

  @Test
  public void submitPresent() {
      homePage.openPage();
      homePage.submit(js);
      homePage.submitPresent();

      assertThat(homePage.submitPresent(),equalToIgnoringWhiteSpace("Пошук"));
  }


  @Test
  public void checkMileage() {
      homePage.openPage();
      homePage.chooseCategories("1");
      homePage.chooseBrand();
      homePage.chooseModel("Aveo");
      homePage.chooseRegion("Закарпатська обл");
      homePage.chooseYearsRange("2009","2010");
      homePage.submit(js);
      carListPage.clickOnCar();
      carPage.checkMileage();

      assertThat(carPage.checkMileage(),equalTo("89"));
  }

  @Test
  public void checkSellerName() {
    homePage.openPage();
    homePage.chooseCategories("1");
    homePage.chooseBrand();
    homePage.chooseModel("Aveo");
    homePage.chooseRegion("Закарпатська обл");
    homePage.chooseYearsRange("2009", "2010");
    homePage.submit(js);
    carListPage.clickOnCar();

    assertThat(carPage.getSellerName(),equalToIgnoringWhiteSpace("Ярослав"));
  }

  @AfterEach
  public void closeDriver() {
      if (driver != null) {
          driver.quit();
      }
  }

}

