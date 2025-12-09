package excessoes.teste;

import excessoes.dominio.IdadeInvalidaException;

import java.util.Scanner;

public class IdadeTeste01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = sc.nextInt();

        try {
            verificaIdade(idade);
            System.out.println("Acesso concedido.");
        } catch (IdadeInvalidaException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }


    private static void verificaIdade(int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("Acesso negado! este conteúdo não é permitido para menores de 18 anos.");
        }
    }
}
