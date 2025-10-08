package excessoes.dominio;

public class NomeInvalidoException extends RuntimeException {

    public NomeInvalidoException() {

    }

    public NomeInvalidoException(String message) {
        super(message);
    }
}
