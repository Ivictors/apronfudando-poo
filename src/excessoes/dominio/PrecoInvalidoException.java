package excessoes.dominio;

public class PrecoInvalidoException extends RuntimeException {

    public PrecoInvalidoException() {
    }

    public PrecoInvalidoException(String message) {
        super(message);
    }
}
