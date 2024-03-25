package homework19AutoRiaRefactoring;
import homework14.loger.StartGame;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage2 extends BasePage {
    final Logger logger = LogManager.getLogger(StartGame.class);

    public HomePage2(WebDriver driver) {
        super(driver);
    }
    protected WebElement sbmit;

    public void openPage() {
        driver.get("https://auto.ria.com/uk/");
    }
    @FindBy(xpath = "//select[@id='categories']")
    private WebElement categories;
    @FindBy(xpath = "//div[@id='brandTooltipBrandAutocomplete-brand']")
    private WebElement openBrand;
    @FindBy(xpath = "//li[@data-value='13']//a[text()='Chevrolet']")
    private WebElement brandChevrolet;
    @FindBy(xpath = "//label[@for='brandTooltipBrandAutocompleteInput-model']")
    private WebElement openModel;
    @FindBy(xpath = "//input[@id='brandTooltipBrandAutocompleteInput-model']")
    private WebElement inputModal;
    @FindBy(xpath = "//a[@data-value='1038']")
    private  WebElement selectModal;
    @FindBy(xpath = "//label[@for='brandTooltipBrandAutocompleteInput-region']")
    private WebElement labelBrand;
    @FindBy(xpath = "//input[@id='brandTooltipBrandAutocompleteInput-region']")
    private WebElement inputBrand;
    @FindBy(xpath = "//a[@class='item'and text()='Закарпатська обл.']")
    private WebElement selectBrand;
    @FindBy(xpath = "//label[@for='forYear' and @class='pseudoelement _grey']")
    private WebElement openYearsRange;
    @FindBy(xpath = "//select[@id='yearFrom']")
    private WebElement yearsFrom;

    @FindBy(xpath = "//select[@id='yearTo']")
    private WebElement yearsTo;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitPath;

    public void chooseCategories(String value) {
        Select selectCategories = new Select(categories);
        selectCategories.selectByValue(value);
        logger.debug("Categories is created");
    }

    public void chooseBrand(){
        openBrand.click();
        logger.debug("dropdown is opened");
        brandChevrolet.click();
        logger.debug("Chevrolet is selected");
    }

    public void chooseModel(String model) {
        openModel.click();
        logger.debug("Model dropdown is opened");
        inputModal.sendKeys(model);
        selectModal.click();
        logger.debug("Model is selected");
    }

    public void chooseRegion(String region) {
        labelBrand.isSelected();
        logger.debug("label Brand is selected");
        inputBrand.sendKeys(region);
        logger.debug("Region is sent");
        selectBrand.click();
        logger.debug("Region is selected");
    }

    public void chooseYearsRange(String from, String to) {
        openYearsRange.click();
        logger.debug("Years range dropdown is opened");
        new Select(yearsFrom).selectByValue(from);
        logger.debug("Years From is selected");
        new Select(yearsTo).selectByValue(to);
        logger.debug("Years To is selected");
    }

    public String submitPresent() {
        return submitPath.getText();
    }

    public void submit(JavascriptExecutor js) {
        try{
            submitPath.click();
            logger.debug("Submit button is clicked by Selenium");
        } catch (ElementClickInterceptedException exe)
        {
            js.executeScript("arguments[0].click();",submitPath);
            logger.debug("'executer' is used");
        }
    }
}

