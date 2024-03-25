package homework18Autoria;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    private final WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    protected WebElement sbmit;



    public void openPage() {
        driver.get("https://auto.ria.com/uk/");
    }

    public void chooseCategories(String value) {
        Select selectCategories = new Select(driver.findElement(By.xpath("//select[@id='categories']")));
        selectCategories.selectByValue(value);
    }

    public void chooseBrand(){
        driver.findElement(By.xpath("//div[@id='brandTooltipBrandAutocomplete-brand']")).click();
        driver.findElement(By.xpath("//li[@data-value='13']//a[text()='Chevrolet']")).click();
    }

    public void chooseModel(String model) {
        driver.findElement(By.xpath("//label[@for='brandTooltipBrandAutocompleteInput-model']")).click();
        driver.findElement(By.xpath("//input[@id='brandTooltipBrandAutocompleteInput-model']")).sendKeys(model);
        driver.findElement(By.xpath("//a[@data-value='1038']")).click();
    }

    public void chooseRegion(String region) {
        driver.findElement(By.xpath("//label[@for='brandTooltipBrandAutocompleteInput-region']"));
        driver.findElement(By.xpath("//input[@id='brandTooltipBrandAutocompleteInput-region']")).sendKeys(region);
        driver.findElement(By.xpath("//a[@class='item'and text()='Закарпатська обл.']")).click();
    }

    public void chooseYearsRange(String from, String to) {
        driver.findElement(By.xpath("//label[@for='forYear' and @class='pseudoelement _grey']")).click();
        new Select(driver.findElement(By.xpath("//select[@id='yearFrom']"))).selectByValue(from);
        new Select(driver.findElement(By.xpath("//select[@id='yearTo']"))).selectByValue(to);
    }

    public String submitPresent() {
        return sbmit.getText().toString();
    }

    public void submit(JavascriptExecutor js) {
        try{
            sbmit = driver.findElement(By.xpath("//button[@type='submit']"));
            sbmit.click();
        } catch (ElementClickInterceptedException exe)
        {
            js.executeScript("arguments[0].click();",sbmit);
        }
    }
}
