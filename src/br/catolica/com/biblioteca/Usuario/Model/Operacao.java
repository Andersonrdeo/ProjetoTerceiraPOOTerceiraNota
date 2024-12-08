package br.catolica.com.biblioteca.Usuario.Model;

import br.catolica.com.biblioteca.Usuario.Model.Enum.MetodoPagamento;

public abstract class Operacao {
    protected Usuario usuario;
    protected Livro livro;
    protected MetodoPagamento metodoPagamento;

    public Operacao(Usuario usuario, Livro livro, MetodoPagamento metodoPagamento) {
        this.usuario = usuario;
        this.livro = livro;
        this.metodoPagamento = metodoPagamento;
    }

    public abstract void executar();
}
