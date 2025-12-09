package excessoes.teste;

import excessoes.dominio.MetodoPagamento;
import excessoes.dominio.PagamentoException;
import excessoes.dominio.PagamentoService;


import java.util.InputMismatchException;
import java.util.Scanner;

public class PagamentoTeste01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione uma forma de pagamento: ");
        System.out.println("1. Pagamento cartão de Credito. ");
        System.out.println("2. Pagamento cartão de Debito");
        System.out.println("3. Pagamento a vista com Pix");

        int op = input.nextInt();

        try {
            if (op < 1 || op > 3) {
                throw new InputMismatchException("Consulte o menu para verificar as opções disponiveis");
            } else Pagamentos(op);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }

    }

    public static void Pagamentos(int op) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do Pagamento:");

        switch (op) {
            case 1:
                try {
                    PagamentoService pagamentoService1 = new PagamentoService(input.nextDouble(), MetodoPagamento.CARTAO_CREDITO);
                } catch (PagamentoException e) {
                    System.out.println("Erro " + e.getMessage());
                }
                break;
            case 2:
                try {
                    PagamentoService pagamentoService2 = new PagamentoService(input.nextDouble(), MetodoPagamento.CARTAO_DEBITO);
                } catch (PagamentoException e) {
                    System.out.println("Erro " + e.getMessage());
                }
                break;
            case 3:
                try {
                    PagamentoService pagamentoService3 = new PagamentoService(input.nextDouble(), MetodoPagamento.PIX);

                } catch (PagamentoException e) {
                    System.out.println("Erro " + e.getMessage());
                }
                break;
            default:
                System.out.println("Opção invalida");
        }

    }
}
