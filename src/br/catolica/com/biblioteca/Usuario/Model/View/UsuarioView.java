package br.catolica.com.biblioteca.Usuario.Model.View;

import br.catolica.com.biblioteca.Usuario.Model.Administrador;
import br.catolica.com.biblioteca.Usuario.Model.Cliente;
import br.catolica.com.biblioteca.Usuario.Model.Controller.UsuarioController;
import br.catolica.com.biblioteca.Usuario.Model.DAO.UsuarioDAO;
import br.catolica.com.biblioteca.Usuario.Model.Enum.TipoUsuario;
import br.catolica.com.biblioteca.Usuario.Model.Usuario;


import java.util.Scanner;

public class UsuarioView {
    private Scanner scanner = new Scanner(System.in);

    public UsuarioView() {
    }

    public void exibirLogin() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioController usuarioController = new UsuarioController(usuarioDAO);

        Usuario usuario = usuarioController.fazerLogin(email, senha);

        if (usuario != null) {
            usuario.exibirInformacoes();
        }
    }

    public void exibirCadastro() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        System.out.print("Tipo (1 - Admin, 2 - Cliente): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        TipoUsuario tipoUsuario = (tipo == 1) ? TipoUsuario.ADMINISTRADOR : TipoUsuario.CLIENTE;
        Usuario usuario = tipoUsuario == TipoUsuario.ADMINISTRADOR
                ? new Administrador(nome, email, senha)
                : new Cliente(nome, email, senha);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioController usuarioController = new UsuarioController(usuarioDAO);
        usuarioController.cadastrarUsuario(usuario);
    }
}