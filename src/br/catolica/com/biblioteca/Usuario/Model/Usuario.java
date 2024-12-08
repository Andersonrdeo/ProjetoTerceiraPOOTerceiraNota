package br.catolica.com.biblioteca.Usuario.Model;


import br.catolica.com.biblioteca.Usuario.Model.Enum.TipoUsuario;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected TipoUsuario tipo;

    public Usuario(String nome, String email, String senha, TipoUsuario tipo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
    }

    public abstract void exibirInformacoes();

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }
}