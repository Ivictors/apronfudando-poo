package streamss.teste;

import streamss.dominio.Funcionario;

import java.util.*;
import java.util.stream.Collectors;

public class FuncionarioTeste {
    public static void main(String[] args) {
        double minSalario = 3.000;

        Funcionario funcionario1 = new Funcionario("Jose", "Jose@gmail.com", 3.200);
        Funcionario funcionario2 = new Funcionario("Maria", "Maria@gmail.com", 1.000);
        Funcionario funcionario3 = new Funcionario("Marcos", "AMarcos@hotmail.com", 1.800);

        List<Funcionario> funcionarios = Arrays.asList(funcionario1, funcionario2, funcionario3);

        Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        List<String> collect = funcionarios.stream().filter(f -> f.getSalario() > minSalario)
                .map(f -> f.getEmail())
                .sorted(comparator)
                .collect(Collectors.toList());

        Double somaSal = funcionarios.stream().filter(x -> x.getNome().charAt(0) == 'M')
                .map(x -> x.getSalario())
                .reduce(0.0, (x, y) -> x + y);

        collect.forEach(System.out::println);
        System.out.printf("%.3f", somaSal);
    }
}
