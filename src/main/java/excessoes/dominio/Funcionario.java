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
            throw new NomeInvalidoException("O nome não pode estar vazio");
        }
        this.nome = nome;
        if (idade <= 16) {
            throw new IdadeInvalidaException("A idade deve ser maior ou igual a 16.");
        }
        this.idade = idade;
        if (salario <= 0.0) {
            throw new SalarioInvalidoException("O salário deve ser maior que 0.");
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
