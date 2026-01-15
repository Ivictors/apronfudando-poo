package lambdass.dominio;

import java.util.function.Consumer;

public class ExConsumer implements Consumer<Produto> {
    @Override
    public void accept(Produto produto) {
        produto.setPreco(produto.getPreco()*1.1);
    }
}
