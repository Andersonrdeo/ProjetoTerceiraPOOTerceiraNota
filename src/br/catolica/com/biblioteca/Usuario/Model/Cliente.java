package br.catolica.com.biblioteca.Usuario.Model;


import br.catolica.com.biblioteca.Usuario.Model.Enum.TipoUsuario;

public class Cliente extends Usuario {
    public Cliente(String nome, String email, String senha) {
        super(nome, email, senha, TipoUsuario.CLIENTE);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente: " + nome);
    }
}