package pageObject;

import Actions.Elements;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.Framework;

import java.io.IOException;

public class oportunidade_page {

    WebDriver webDriver;
    WebDriverWait wait;
    Framework frame;
    static Elements element;

    public oportunidade_page(WebDriver driver){

        PageFactory.initElements(driver, this);
        webDriver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    //Oportunidade

    private By driver;

    @FindBy(xpath = "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]")
    WebElement menuOpp;

    @FindBy(xpath = "//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li/a/div")
    WebElement btnNovo;

    @FindBy(xpath = "//div[2]/div/div/div/input")
    WebElement inputValor;

    @FindBy(xpath = "//div[2]/div[2]/div/div/div/div/input")
    WebElement inputDataFechamento;

    @FindBy(xpath = "//div[3]/div/div/div/div/input")
    WebElement inputNomeOpp;

    @FindBy(xpath = "//div[4]/div/div/div/div/div/div/div/div/input")
    WebElement inputConta;

    @FindBy(xpath = "//a/div[2]/div")
    WebElement selectConta;

    @FindBy(xpath = "//a[contains(text(),'-- Nenhum --')]")
    WebElement inputFase;

    @FindBy(xpath = "//a[contains(text(),'Qualification')]")
    WebElement selectFase;

    @FindBy(xpath = "//a[contains(.,'-- Nenhum --')]")
    WebElement inputTipo;

    @FindBy(xpath = "//a[contains(.,'New Customer')]")
    WebElement selectTipo;

    @FindBy(xpath = "//a[contains(.,'-- Nenhum --')]")
    WebElement inputOrigemLead;

    @FindBy(xpath = "//a[contains(text(),'Phone Inquiry')]")
    WebElement selectOrigemLead;


    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/button[3]")
    WebElement btnSalvar;

    @FindBy(xpath = "//span[contains(.,'Oportunidade \"Opp Teste Salesforce\" foi criado(a).')]")
    WebElement msgOppSalva;



    public void oppPage(String share, Scenario scenario) throws InterruptedException, IOException {
        wait.until(ExpectedConditions.elementToBeClickable(menuOpp)).click();
        Thread.sleep(5000);
    }

    public void clickBtnNovo(String clickBtnNovo){
        btnNovo.click();
    }

    public void imputCamposOpp(){
        inputValor.sendKeys("300000");
        inputDataFechamento.sendKeys("16/02/2022");
        inputNomeOpp.sendKeys("Opp Teste Salesforce");
        inputConta.click();
        selectConta.click();
        inputFase.click();
        selectFase.click();
        inputTipo.click();
        selectTipo.click();
        inputOrigemLead.click();
        selectOrigemLead.click();
    }

    public void salvarOpp(){
        btnSalvar.click();
    }

    public void validaOppSalva(){
        msgOppSalva.isEnabled();
    }

    public void titlePageOppSalva(String title) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(title, webDriver.getTitle());
    }

}
