package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getDriver (String name) {
        WebDriver driver = null;
        switch (name) {
            case "CHROME": return new ChromeDriver();
            case "FIREFOX": return new FirefoxDriver();
            default: return new ChromeDriver();
        }
    }
}
