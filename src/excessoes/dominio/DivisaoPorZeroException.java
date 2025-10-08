package excessoes.dominio;

public class DivisaoPorZeroException extends Exception {

    public DivisaoPorZeroException() {
    }

    public DivisaoPorZeroException(String message) {
        super(message);
    }
}
