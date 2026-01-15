package excessoes.dominio;

public class PagamentoException extends Exception {
    public PagamentoException(String message) {
        super(message);
    }

    public PagamentoException() {
        System.out.println("Erro ao efetuar o pagamento");
    }
}
