package lambdass.teste;

import lambdass.dominio.ExConsumer;
import lambdass.dominio.Produto;

import java.util.ArrayList;
import java.util.List;

public class InterfacesLambdaTest02Consumer {
    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>(List.of(
                new Produto("Caderno", "Papelaria", 20.00),
                new Produto("Lapís", "Papelaria", 2.00),
                new Produto("Borracha", "Papelaria", 0.90)
        ));
//        Consumer<Produto>produtoConsumer = p-> p.setPreco(p.getPreco()*1.1);
//        produtoList.forEach(p-> p.setPreco(p.getPreco()*1.1););

        produtoList.forEach(new ExConsumer());
        produtoList.forEach(System.out::println);
    }
}
