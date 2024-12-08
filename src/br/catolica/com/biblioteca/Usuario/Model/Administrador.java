package br.catolica.com.biblioteca.Usuario.Model;


import br.catolica.com.biblioteca.Usuario.Model.Enum.TipoUsuario;

public class Administrador extends Usuario {
    public Administrador(String nome, String email, String senha) {
        super(nome, email, senha, TipoUsuario.ADMINISTRADOR);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Administrador: " + nome);
    }
}