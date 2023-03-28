package pages;

import config.browser_factory.DriverFactory;
import org.openqa.selenium.By;

public class BasePage {
    public static void write(By by, String text) throws Exception {
        DriverFactory.getDriver().findElement(by).clear();
        DriverFactory.getDriver().findElement(by).sendKeys(text);
    }
    public static void click(By by) throws Exception{
        DriverFactory.getDriver().findElement(by).click();
    }
}
