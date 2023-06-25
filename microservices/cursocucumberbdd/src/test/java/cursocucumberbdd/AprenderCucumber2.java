package cursocucumberbdd;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber2 {

    @Dado("que o ticket( especial)? é A.(\\d{3})$")
    public void que_o_ticket_é_af(String tipo, int codigo) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("OK");
    }
    @Dado("que o valor da passagem é R$ {double}")
    public void que_o_valor_da_passagem_é_r$(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("OK");
    }

    @Dado("que o nome do passageiro é {string}")
    public void queONomeDoPassageiroÉ(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("OK");
    }

    @Dado("que o telefone do passageiro é (9\\d{3}-\\d{4})$")
    public void que_o_telefone_do_passageiro_é(String telefone) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("OK");
    }
    @Quando("criar os steps")
    public void criar_os_steps() {

    }
    @Então("o teste vai funcionar")
    public void o_teste_vai_funcionar() {

    }

}
