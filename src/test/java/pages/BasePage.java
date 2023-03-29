package pages;

import config.browser_factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage {

    protected static List<WebElement> listOfElements;

    public static void write(By by, String text) throws Exception {
        DriverFactory.getDriver().findElement(by).clear();
        DriverFactory.getDriver().findElement(by).sendKeys(text);
    }
    public static void click(By by) throws Exception{
        DriverFactory.getDriver().findElement(by).click();
    }
    /*
     * Method to list elements in a list by css and tag
     */
    public static List<WebElement> elementsList(By by, String tag) throws Exception {
        WebElement table = DriverFactory.getDriver().findElement(by);
        return table.findElements(By.tagName(tag));
    }
    /*
     * Method to select an element from a list by css and tag
     */
    public static void selectElementsList(By by, String tag) throws Exception {
        listOfElements = elementsList(by, tag);
    }
    public static void clickOnListOfElements(String value) throws Exception {
        for (int i = 0; i < listOfElements.size(); i++) {
            if (listOfElements.get(i).getText().equals(value)) {
                listOfElements.get(i).click();
                break;
            }
        }
    }
    public static void waitUntilElementToBeSelected(By by, int time) throws Exception {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
