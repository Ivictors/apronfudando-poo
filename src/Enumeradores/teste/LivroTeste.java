package Enumeradores.teste;

import Enumeradores.dominio.Livros;

import java.util.EnumSet;

public class LivroTeste {
    public static void main(String[] args) {

        System.out.println("Lista de livros");

        for (Livros livros : Livros.values()){
            System.out.println(livros);
        }
        for (Livros livrosEntre : EnumSet.range(Livros.JCP,Livros.JEI)){
            System.out.println(livrosEntre);
        }
    }
}
