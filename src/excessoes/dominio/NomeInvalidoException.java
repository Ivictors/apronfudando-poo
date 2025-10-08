package excessoes.dominio;

public class NomeInvalidoException extends Exception {

    public NomeInvalidoException() {

    }

    public NomeInvalidoException(String message) {
        super(message);
    }
}
