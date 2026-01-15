package excessoes.dominio;

public class IdadeInvalidaException extends Exception {

    public IdadeInvalidaException() {
    }

    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }

}
