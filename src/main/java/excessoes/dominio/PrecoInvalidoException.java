package excessoes.dominio;

public class PrecoInvalidoException extends Exception {

    public PrecoInvalidoException() {
    }

    public PrecoInvalidoException(String message) {
        super(message);
    }
}
