package lambdass.teste;

import lambdass.dominio.Produto;
import lambdass.dominio.ProdutoFiltro;

import java.util.ArrayList;
import java.util.List;

public class InterfacesLambdaTest04Personalizado {
    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>(List.of(
                new Produto("Caderno", "Papelaria", 20.00),
                new Produto("Lapís", "Papelaria", 2.00),
                new Produto("Borracha", "Papelaria", 0.90)
        ));

        ProdutoFiltro pf = new ProdutoFiltro();
        double calculoFiltro = pf.filtro(produtoList,p->p.getCategoria().charAt(0) == 'P');
        System.out.println(calculoFiltro);
    }
}
