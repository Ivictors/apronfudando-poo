package lambdass.teste;

import lambdass.dominio.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InterfacesLambdaTest03Function {
    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>(List.of(
                new Produto("Caderno", "Papelaria", 20.00),
                new Produto("Lapís", "Papelaria", 2.00),
                new Produto("Borracha", "Papelaria", 0.90)
        ));

//        List<String> collect = produtoList.stream().map(produtoFunction).collect(Collectors.toList());
//        List<String> collect = produtoList.stream().map(new ExFunction()).collect(Collectors.toList());

        Function<Produto,String> produtoFunction = p -> p.getNome().toUpperCase();
        produtoList.forEach(System.out::println);
    }
}
