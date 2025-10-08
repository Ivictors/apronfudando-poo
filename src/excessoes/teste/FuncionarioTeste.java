package excessoes.teste;

import excessoes.dominio.Funcionario;
import excessoes.dominio.IdadeInvalidaException;
import excessoes.dominio.NomeInvalidoException;
import excessoes.dominio.SalarioInvalidoException;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        boolean op = true;
        do {
            try {
                String nome = sc.nextLine();
                int idade = sc.nextInt();
                double salario = sc.nextDouble();
                sc.nextLine();

                Funcionario funcionario = new Funcionario(nome,idade,salario);

                System.out.println(funcionario);

                op = false;

            } catch (NomeInvalidoException | IdadeInvalidaException | SalarioInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Entrada invalida!");;
            }
            System.out.println("Por favor, tente novamente!");
        } while (op);

        sc.close();
    }
}
