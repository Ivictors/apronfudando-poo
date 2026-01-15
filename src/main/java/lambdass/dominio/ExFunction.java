package lambdass.dominio;

import java.util.function.Function;

public class ExFunction implements Function<Produto,String> {
    @Override
    public String apply(Produto produto) {
        return produto.getNome().toUpperCase();
    }
}
