package excessoes.dominio;

public class IdadeInvalidaException extends RuntimeException {

    public IdadeInvalidaException() {
    }

    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }

}
