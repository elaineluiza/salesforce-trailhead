package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.*;
import org.openqa.selenium.support.PageFactory;
import pageObject.oportunidade_page;
import util.Framework;
import java.io.IOException;

public class oportunidade {

    oportunidade_page page;
    Scenario scenario;
    Framework frame;

    @Dado("seleciono o menu {string}")
    public void selecionoOMenu(String menuOpp) throws IOException, InterruptedException {
        page = PageFactory.initElements(Framework.browserDriver(), oportunidade_page.class);
        page.oppPage(menuOpp, scenario);
    }

    @E("seleciono {string}")
    public void seleciono(String clickBtnNovo) {
        page.clickBtnNovo(clickBtnNovo);

    }

    @Quando("preencho os dados obrigatorios")
    public void preenchoOsDadosObrigatorios() {
        page.imputCamposOpp();
    }

    @Então("a oportunidade é cadastrada")
    public void aOportunidadeÉCadastrada() throws InterruptedException {
        page.salvarOpp();
        page.validaOppSalva();
        page.titlePageOppSalva("Opp Teste Salesforce | Salesforce");
    }

    @After
    public void after() throws IOException {
        frame = new Framework();
    }


}
