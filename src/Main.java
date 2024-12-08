import br.catolica.com.biblioteca.Usuario.Model.View.UsuarioView;

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        UsuarioView usuarioView = new UsuarioView();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Cadastro");
        System.out.println("2. Login");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            usuarioView.exibirCadastro();
        } else if (opcao == 2) {
            usuarioView.exibirLogin();
        } else if (opcao == 0) {
            System.out.println("Saindo do Sistema! Até logo!");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}