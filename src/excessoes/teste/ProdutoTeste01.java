package excessoes.teste;

import excessoes.dominio.PrecoInvalidoException;
import excessoes.dominio.Produto;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste01 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        boolean op = true;
        do {

            try {
                System.out.println("Entre com nome produto e depois com valor nessa ordem: ");
                String nomeProduto = sc.nextLine();
                double valorProduto = sc.nextDouble();


                Produto produtos = new Produto(nomeProduto, valorProduto);
                    System.out.println(produtos);

                op = false;

            }
            catch (PrecoInvalidoException e) {
                sc.nextLine();
                System.out.println("Erro: " + e.getMessage());
            }
            catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Entrada incorreta, tente novamente!");
            }
            catch (RuntimeException e) {
                sc.nextLine();
                throw new RuntimeException(e);
            }
        } while(op);
        System.out.println("Programa finalizado.");
        sc.close();
    }
}
