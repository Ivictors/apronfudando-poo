package excessoes.dominio;

public class SalarioInvalidoException extends Exception {

    public SalarioInvalidoException() {
    }

    public SalarioInvalidoException(String message) {
        super(message);
    }
}
