package cursocucumberbdd;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;


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

    private int contador =0;
    @Dado("que o valor do contador é {int}")
    public void queOValorDoContadorÉ(Integer int1) {
        contador = int1;
    }
    @Quando("eu incrementar em {int}")
    public void euIncrementarEm(Integer int1) {
        contador += int1;
    }
    @Então("que o valor do contador será {int}")
    public void queOValorDoContadorSerá(Integer int1) {
        System.out.println(int1);
        System.out.println(contador);
        //Assert.assertTrue(int1==contador);
        Assertions.assertEquals(int1,contador);

    }

    private LocalDate entrega = null;
    private LocalDate entregaAtrasada = null;
    @Dado("que a entrega é dia {int}\\/{int}\\/{int}")
    public void que_a_entrega_é_dia(Integer dia, Integer mes, Integer ano) {
        entrega = LocalDate.of(ano,mes,dia);
    }
    @Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
    public void a_entrega_atrasar_em_dias(Integer numero, String tempo) {
        if (tempo.equals("dias")) {
            entregaAtrasada = entrega.plusDays(numero);
        }
        if (tempo.equals("meses")) {
            entregaAtrasada = entrega.plusMonths(numero);
        }
    }
    @Então("a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
    public void a_entrega_será_efetuada_em(String data) {
        //07/04/2018
        int dia =  Integer.valueOf(data.substring(0,2));
        int mes =  Integer.valueOf(data.substring(3,5));
        int ano =  Integer.valueOf(data.substring(6,10));

        LocalDate dataComparativa = LocalDate.of(ano,mes,dia);
        Assertions.assertEquals(dataComparativa,entregaAtrasada);
    }


}
