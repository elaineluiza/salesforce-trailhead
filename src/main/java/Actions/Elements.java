package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
    static WebElement Element;
    static WebDriverWait wait;

    public Elements(WebDriver driver) {

        wait = new WebDriverWait(driver, 30);


    }

    public WebElement Id(String Locator) {

        Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Locator)));
        return Element;


    }

    public void id_sendKeys(String Locator, String sendKeys) {

        Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Locator)));
        Element.sendKeys(sendKeys);

    }

    public void id_click(String Locator) {

        Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Locator)));
        Element.click();

    }

    public void xpath_clickable(String Locator) {

        Element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locator)));
        Element.click();
    }


    public void classClick(String locator) {
        Element = wait.until(ExpectedConditions.elementToBeClickable(By.className(locator)));
        Element.click();
    }


}
