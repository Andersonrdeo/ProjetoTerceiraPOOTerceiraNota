package br.catolica.com.biblioteca.Usuario.Model;

import br.catolica.com.biblioteca.Usuario.Model.Enum.GeneroLivro;

public class LivroInfantil extends Livro {
    private GeneroLivro genero;

    public LivroInfantil(String titulo, String autor, double precoReserva, double precoAluguel, int classificacaoIndicativa) {
        super(titulo, autor, precoReserva, precoAluguel, classificacaoIndicativa);
        this.genero = GeneroLivro.INFANTIL;
    }

    public double calcularValorTotal() {
        return precoReserva + precoAluguel;
    }
}
