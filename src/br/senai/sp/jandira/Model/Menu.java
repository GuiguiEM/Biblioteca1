package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    Usuarios usuarios = new Usuarios();
    Biblioteca biblioteca = new Biblioteca();

    boolean continuar = true;

    public void menu(){

        while (continuar){
            System.out.println("---------------Sistema Biblioteca---------------");
            System.out.println("Escolha uma das seguintes opções para prosseguir: ");
            System.out.println("1 - Cadastro do Usuário");
            System.out.println("2 - Cadastro do Livro");
            System.out.println("3 - Consulta dos Livros cadastrados");
            System.out.println("4 - Sair");
            System.out.println("------------------------------------------------");

            int escolha = teclado.nextInt();

            Livros livros = new Livros();

            switch (escolha){
                case 1:
                    usuarios.cadastroUsuario();
                    break;

                case 2:
                    livros.cadastroLivro();
                    biblioteca.adicionarLivro(livros);

                case 3:
                    biblioteca.consultarLivros();
                    break;

                case 4:
                    continuar = false;
                    break;
            }
        }
    }

}
