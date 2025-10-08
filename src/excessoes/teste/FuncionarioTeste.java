package excessoes.teste;

import excessoes.dominio.Funcionario;
import excessoes.dominio.IdadeInvalidaException;
import excessoes.dominio.NomeInvalidoException;
import excessoes.dominio.SalarioInvalidoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
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

            } catch (NullPointerException e) {
                throw new NomeInvalidoException("O nome não pode estar vazio");
            } catch (IllegalArgumentException e) {
                throw new IdadeInvalidaException("A idade deve ser maior ou igual a 16.");
            } catch (InputMismatchException e) {
                throw new SalarioInvalidoException("O salário deve ser maior que 0.");
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }

        } while (op);

        sc.close();
    }
}
