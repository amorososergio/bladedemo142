package steps;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;

public class comprarPassagemBDD {

    WebDriver driver;
    String origem;
    String destino;

    @Before
    public void iniciar() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.manage().window().maximize();
    }

    @After
    public void finalizar(){
        driver.quit();
    }

    @Dado("que acesso o site {string}")
    public void que_acesso_o_site(String url) {
        driver.get(url);
    }

    @Quando("seleciono a origem {string} e destino {string}")
    @Quando("seleciono a {string} e {string}")
    public void seleciono_origem_e_destino(String origem, String destino) {
        {
            this.origem = origem;
            WebElement campoOrigem = driver.findElement(By.name("fromPort"));
            campoOrigem.click();
            campoOrigem.findElement(By.xpath("//option[. = '" + origem + "']")).click();
        }

        {
            this.destino = destino;
            WebElement campoDestino = driver.findElement(By.name("toPort"));
            campoDestino.click();
            campoDestino.findElement(By.xpath("//option[. = '" + destino + "']")).click();
        }
    }

    @Quando("clico no botao {string}")
    public void clico_no_botão(String string) {
        driver.findElement(By.cssSelector(".btn-primary")).click();
    }

    @Entao("visualizo a lista de voos")
    public void visualizo_a_lista_de_voos() {
        assertEquals("Flights from " + origem + " to " + destino + ":", driver.findElement(By.cssSelector("h3")).getText());
    }
}
