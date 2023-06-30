package br.com.roberto.servicos;

import br.com.roberto.entidades.Filme;
import br.com.roberto.entidades.NotaAluguel;

import java.time.LocalDate;

public class AluguelService {
    public NotaAluguel alugar(Filme filme) {
        NotaAluguel notaAluguel = new NotaAluguel();
        notaAluguel.setPreco(filme.getAluguel());
        notaAluguel.setDataEntrega(LocalDate.now().plusDays(1L));
        filme.setEstoque(filme.getEstoque()-1);
        return notaAluguel;
    }
}
