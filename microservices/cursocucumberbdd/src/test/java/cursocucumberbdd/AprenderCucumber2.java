package cursocucumberbdd;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber2 {

    @Dado("que o ticket é AF345")
    public void que_o_ticket_é_af345() {
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
    public void que_o_nome_do_passageiro_é(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("OK");
    }
    @Dado("que o telefone do passageiro é {int}-{int}")
    public void que_o_telefone_do_passageiro_é(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("OK");
    }
    @Quando("criar os steps")
    public void criar_os_steps() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("OK");
    }
    @Então("o teste vai funcionar")
    public void o_teste_vai_funcionar() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("OK");
    }

}
