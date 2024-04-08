package toolsQa.Elements;

import homework19AutoRiaRefactoring.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBox extends BasePage {
    public CheckBox(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@title='Toggle']")
    private WebElement unfoldTree;

    @FindBy(xpath = "//label[@for='tree-node-home']/span[@class='rct-checkbox']")
    private WebElement homeInput;

    public void getPage() {
        driver.get("https://demoqa.com/checkbox");
    }

    public String homeMark() {
        homeInput.click();
        return homeInput.getText();
    }

    public void unfoldParent() {
        unfoldTree.click();
    }



}
