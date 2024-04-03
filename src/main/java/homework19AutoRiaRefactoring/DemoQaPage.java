package homework19AutoRiaRefactoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DemoQaPage extends BasePage {
  public DemoQaPage(WebDriver driver) {
    super(driver);
  }
  @FindBy(xpath = "//div[@id='withOptGroup']/div[@class=' css-yk16xz-control']")
  private WebElement openOne;
  @FindBy(xpath = "//div[@id='react-select-2-option-1-0']")
  private WebElement optionSelect;
  @FindBy(xpath = "//select[@id='oldSelectMenu']")
  private WebElement scrollTo;
  public void scrollPage() {
    new Actions(driver)
            .scrollToElement(scrollTo)
            .perform();
  }
  public void openDropdown(){
      openOne.click();
  }
  public void selectOption(){
      optionSelect.click();
  }
}
