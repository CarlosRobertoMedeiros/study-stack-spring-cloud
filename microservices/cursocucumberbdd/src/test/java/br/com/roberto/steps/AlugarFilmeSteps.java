package br.com.roberto.steps;

import br.com.roberto.entidades.Filme;
import br.com.roberto.entidades.NotaAluguel;
import br.com.roberto.servicos.AluguelService;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class AlugarFilmeSteps {

    private Filme filme;
    private AluguelService aluguelService = new AluguelService();
    private NotaAluguel notaAluguel;
    @Dado("um filme com estoque de {int} unidades")
    public void umFilmeComEstoqueDeUnidades(Integer int1) {
       filme = new Filme();
       filme.setEstoque(int1);
    }
    @Dado("que o preço do aluguel seja R$ {int}")
    public void queOPreçoDoAluguelSejaR$(Integer int1) {
        filme.setAluguel(int1);
    }
    @Quando("alugar")
    public NotaAluguel alugar() {
        notaAluguel = aluguelService.alugar(filme);
        return notaAluguel;
    }
    @Então("que o preço do aluguel será R$ {int}")
    public void queOPreçoDoAluguelSeráR$(Integer int1) {
        Assertions.assertEquals(int1, notaAluguel.getPreco());
    }
    @Então("a data de entrega será no dia seguinte")
    public void aDataDeEntregaSeráNoDiaSeguinte() {
        LocalDate localDate = LocalDate.now();
        LocalDate proximoDia = localDate.plusDays(1L);

        LocalDate dataRetorno = notaAluguel.getDataEntrega();
        Assertions.assertEquals(proximoDia,dataRetorno);
    }
    @Então("o estoque do filme será {int} unidade")
    public void oEstoqueDoFilmeSeráUnidade(Integer int1) {
        Assertions.assertEquals(int1,filme.getEstoque());
    }

}
