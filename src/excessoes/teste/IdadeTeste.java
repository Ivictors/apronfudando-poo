package excessoes.teste;

import excessoes.dominio.IdadeInvalida;

import java.util.Scanner;

public class IdadeTeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = sc.nextInt();

        try {
            verificaIdade(idade);
            System.out.println("Acesso concedido.");
        } catch (IdadeInvalida e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }


    private static void verificaIdade(int idade) throws IdadeInvalida {
        if (idade < 18) {
            throw new IdadeInvalida("Acesso negado! este conteúdo não é permitido para menores de 18 anos.");
        }
    }
}
