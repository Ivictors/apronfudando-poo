package lambdass.dominio;

import java.util.List;
import java.util.function.Predicate;

public class ProdutoFiltro {
    public double filtro(List<Produto> produtoList, Predicate<Produto> predicate) {
        double soma = 0.0;
        for (Produto p : produtoList) {
            if (predicate.test(p)) {
                soma += p.getPreco();
            }
        }
        return soma;
    }
}
