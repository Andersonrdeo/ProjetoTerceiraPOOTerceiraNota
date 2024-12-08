package br.catolica.com.biblioteca.Usuario.Model.Controller;

import br.catolica.com.biblioteca.Usuario.Model.DAO.LivroDAO;
import br.catolica.com.biblioteca.Usuario.Model.Livro;

public class LivroController {
    private LivroDAO livroDAO;

    public LivroController() {
        this.livroDAO = new LivroDAO();
    }

    public void cadastrarLivro(Livro livro) {}

    public void alterarLivro(String titulo) {}

    public void removerLivro(String titulo) {}

    public void listarLivros() {}
}
