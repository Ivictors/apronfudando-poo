package enumeradores.teste;

import enumeradores.dominio.Livros;

import java.util.EnumSet;

public class LivroTeste01 {
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
