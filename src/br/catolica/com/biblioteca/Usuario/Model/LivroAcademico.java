package br.catolica.com.biblioteca.Usuario.Model;

import br.catolica.com.biblioteca.Usuario.Model.Enum.GeneroLivro;

public class LivroAcademico extends Livro {
    private GeneroLivro genero;

    public LivroAcademico(String titulo, String autor, double precoReserva, double precoAluguel, int classificacaoIndicativa) {
        super(titulo, autor, precoReserva, precoAluguel, classificacaoIndicativa);
        this.genero = GeneroLivro.ACADEMICO;
    }

    public double calcularValorTotal() {
        return precoReserva + precoAluguel;
    }
}
