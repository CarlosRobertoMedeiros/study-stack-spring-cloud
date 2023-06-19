package cursocucumberbdd;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {
    @Dado("que criei o arquivo corretamente")
    public void queCrieiOArquivoCorretamente() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Quando("executá-lo")
    public void executáLo() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Qualquer coisa");
    }
    @Então("a especificação deve finalizar com sucesso")
    public void aEspecificaçãoDeveFinalizarComSucesso() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
