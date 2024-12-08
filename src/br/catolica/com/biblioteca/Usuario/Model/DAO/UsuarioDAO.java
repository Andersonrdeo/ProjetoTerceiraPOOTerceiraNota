package br.catolica.com.biblioteca.Usuario.Model.DAO;

import br.catolica.com.biblioteca.Usuario.Model.Usuario;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {
    private ObjectContainer db;

    public UsuarioDAO() {
        db = Db4o.openFile("usuarios.db4o");
    }

    public void salvar(Usuario usuario) {
        db.store(usuario);
        db.commit();
    }

    public Usuario buscarPorEmail(String email) {
        ObjectSet<Usuario> result = db.queryByExample(new Usuario(null, email, null, null) {
            @Override
            public void exibirInformacoes() {

            }
        });
        if (result.hasNext()) {
            return result.next();
        }
        return null;
    }

    public void deletar(Usuario usuario) {
        db.delete(usuario);
        db.commit();
    }

    public List<Usuario> listarTodos() {
        return new ArrayList<>(db.query(Usuario.class));
    }

    public void fechar() {
        db.close();
    }
}