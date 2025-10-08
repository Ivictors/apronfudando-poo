package excessoes.dominio;

public class DivisaoPorZeroException extends RuntimeException {

    public DivisaoPorZeroException() {
    }

    public DivisaoPorZeroException(String message) {
        super(message);
    }
}
