package br.catolica.com.biblioteca.Usuario.Model.DAO;

import br.catolica.com.biblioteca.Usuario.Model.Livro;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import java.util.List;

public class LivroDAO {
    private ObjectContainer db;

    public LivroDAO() {
        db = Db4o.openFile("livros.db4o");
    }

    public void salvar(Livro livro) {}

    public Livro buscarPorTitulo(String titulo) {
        return null;
    }

    public List<Livro> listarTodos() {
        return null;
    }
}
