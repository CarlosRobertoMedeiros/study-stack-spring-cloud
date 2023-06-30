package br.com.roberto.entidades;

import java.time.LocalDate;

public class NotaAluguel {
    private int preco;
    private LocalDate dataEntrega;

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
