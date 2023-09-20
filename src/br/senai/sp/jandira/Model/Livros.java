package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livros {
    Scanner teclado = new Scanner(System.in);

    List<Livros> listLivros = new ArrayList<>();
    
    public String titulo;
    public String autor;
    public String genero;
    public int ISBN;

    public void cadastroLivro(){
        do {
            System.out.println("---------------Cadastro do Livro---------------");

            Livros livros = new Livros();

            System.out.println("Insira o nome do livro que deseja cadastrar: ");
            titulo = teclado.nextLine();
            System.out.println("Insira o nome do autor do livro: ");
            autor = teclado.nextLine();
            System.out.println("Insira o gênero desse livro: ");
            genero = teclado.nextLine();


            listLivros.add(livros);

            System.out.println("Deseja cadastrar outro livro?(S/N) ");
        }while (teclado.nextLine().equalsIgnoreCase("s"));
    }

}
