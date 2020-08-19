package POMS;

import Utils.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.URL;
import java.util.Set;

public class ParentClass {

    WebDriver driver;
    WebDriverWait wait;

    public ParentClass() {
        driver = BaseDriver.getDriver();
        this.wait = new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitUntilVisible(WebElement elementToWait) {
        wait.until(ExpectedConditions.visibilityOf(elementToWait));

     }

    public void verifyURLFunction(String urlToCheck) {

        Set<String> allWindows=driver.getWindowHandles();
        String parentWindow=driver.getWindowHandle();
        for(String windowName:allWindows){
            driver.switchTo().window(windowName);
        }

        String actualUrl=driver.getCurrentUrl();
        System.out.println("URL current:"+actualUrl);
        Assert.assertTrue(actualUrl.contains(urlToCheck));
        System.out.println(urlToCheck+" has been verified by Atlanta group!");
        driver.close();
        driver.switchTo().window(parentWindow);

    }

}
