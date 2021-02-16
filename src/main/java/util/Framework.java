package util;

import Actions.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Framework {
    static WebDriver driver;
    static Elements elements;


    //método com as configurações padrões para executar os testes com o Chrome
    //Login
    public static WebDriver browserDriver() {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("URL");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        elements = new Elements(driver);
        elements.id_sendKeys("username", "SEUUSUARIO");
        elements.id_sendKeys("password", "SUASENHA");
        elements.id_click("Login");
        return driver;
    }
    public Framework() throws IOException {
        driver.quit();
    }
}
