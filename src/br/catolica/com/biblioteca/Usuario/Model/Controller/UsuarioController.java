package br.catolica.com.biblioteca.Usuario.Model.Controller;

import br.catolica.com.biblioteca.Usuario.Model.DAO.UsuarioDAO;
import br.catolica.com.biblioteca.Usuario.Model.Enum.TipoUsuario;
import br.catolica.com.biblioteca.Usuario.Model.Usuario;

public class UsuarioController {
    private UsuarioDAO usuarioDAO;

    public UsuarioController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public void cadastrarUsuario(Usuario usuario) {
        try {
            Usuario usuarioExistente = usuarioDAO.buscarPorEmail(usuario.getEmail());
            if (usuarioExistente != null) {
                System.out.println("Usuário já cadastrado!");
            } else {
                usuarioDAO.salvar(usuario);
                System.out.println("Usuário cadastrado com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
        }
    }

    public Usuario fazerLogin(String email, String senha) {
        Usuario usuario = usuarioDAO.buscarPorEmail(email);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        } else {
            System.out.println("Credenciais inválidas.");
            return null;
        }
    }
}