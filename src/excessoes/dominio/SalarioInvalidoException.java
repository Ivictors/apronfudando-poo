package excessoes.dominio;

public class SalarioInvalidoException extends RuntimeException {

    public SalarioInvalidoException() {
    }

    public SalarioInvalidoException(String message) {
        super(message);
    }
}
