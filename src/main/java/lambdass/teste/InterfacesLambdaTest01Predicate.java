package lambdass.teste;

import lambdass.dominio.ExPredicate;
import lambdass.dominio.Produto;

import java.util.ArrayList;
import java.util.List;

public class InterfacesLambdaTest01Predicate {
    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>(List.of(
                new Produto("Caderno", "Papelaria", 20.00),
                new Produto("Lapís", "Papelaria", 2.00),
                new Produto("Borracha", "Papelaria", 0.90)
        ));

//        Predicate<Produto> predicate = p -> p.getPreco() <= 15.00;
//        produtoList.removeIf(p -> p.getPreco() <= 15.00);
//        produtoList.forEach(System.out::println);

        produtoList.removeIf(new ExPredicate());
    }
}
