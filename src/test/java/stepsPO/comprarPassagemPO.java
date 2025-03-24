package stepsPO;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.base;
import pages.homePage;
import pages.reservePage;

public class comprarPassagemPO {

    final WebDriver driver;
    private homePage homePage;
    private reservePage reservePage;

    private String origem;
    private String destino;

    public comprarPassagemPO(base base) {
        this.driver = base.driver;
    }

    @Dado("que acesso o site {string} PO")
    public void que_acesso_o_site_po(String url) {
        homePage = new homePage(driver);
        homePage.acessarHomePage(url);
        assertEquals("BlazeDemo", homePage.lerNomeDaGuia());
    }

    @Quando("seleciono a {string} e {string} PO")
    public void seleciono_a_e_po(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        homePage.selecionarOrigemDestino(origem, destino);
    }

    @E("clico no botao Find Flights PO")
    public void clico_no_botao_find_flights_po() {
        homePage.clicarBotaoFindFlights();
        reservePage = new reservePage(driver);
    }

    @Entao("visualizo a lista de voos PO")
    public void visualizo_a_lista_de_voos_po() {
        assertEquals("BlazeDemo - reserve", reservePage.lerNomeDaGuia());
        assertEquals("Flights from " + origem + " to " + destino + ":", reservePage.lerCabecalhoVoos());
    }

}
