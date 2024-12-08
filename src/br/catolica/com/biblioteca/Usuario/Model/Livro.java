package br.catolica.com.biblioteca.Usuario.Model;

import br.catolica.com.biblioteca.Usuario.Model.Enum.StatusLivro;

public abstract class Livro {
    protected String titulo;
    protected String autor;
    protected double precoReserva;
    protected double precoAluguel;
    protected int classificacaoIndicativa;
    protected StatusLivro status;

    public Livro(String titulo, String autor, double precoReserva, double precoAluguel, int classificacaoIndicativa) {
        this.titulo = titulo;
        this.autor = autor;
        this.precoReserva = precoReserva;
        this.precoAluguel = precoAluguel;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.status = StatusLivro.DISPONIVEL;
    }

    public abstract double calcularValorTotal();

    public String getTitulo() {
        return titulo;
    }

    public StatusLivro getStatus() {
        return status;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
    }
}
