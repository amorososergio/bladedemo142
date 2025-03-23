package stepsPO;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class comprarPassagemPO {

    @Dado("que acesso o site {string} PO")
    public void que_acesso_o_site_po(String string) {
    }

    @Quando("seleciono a {string} e {string} PO")
    public void seleciono_a_e_po(String string, String string2) {
    }

    @E("clico no botao {string} PO")
    public void clico_no_botao_po(String string) {
    }

    @Entao("visualizo a lista de voos PO")
    public void visualizo_a_lista_de_voos_po() {
    }

}
