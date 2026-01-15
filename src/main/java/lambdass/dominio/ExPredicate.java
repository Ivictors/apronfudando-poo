package lambdass.dominio;

import java.util.function.Predicate;

public class ExPredicate implements Predicate<Produto> {

    @Override
    public boolean test(Produto produto) {
        return produto.getPreco() <= 15.00;
    }
}
