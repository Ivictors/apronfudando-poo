package excessoes.dominio;

import java.util.InputMismatchException;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, double salario) throws NomeInvalidoException, IdadeInvalidaException, SalarioInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new NullPointerException();
        }
        this.nome = nome;
        if (idade <= 16) {
            throw new IllegalArgumentException();
        }
        this.idade = idade;
        if (salario <= 0.0) {
            throw new InputMismatchException();
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
