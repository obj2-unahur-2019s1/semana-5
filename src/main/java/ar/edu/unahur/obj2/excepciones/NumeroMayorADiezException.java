package ar.edu.unahur.obj2.excepciones;

public class NumeroMayorADiezException extends RuntimeException {

    public NumeroMayorADiezException(String message) {
        super(message);
    }

    public NumeroMayorADiezException(String message, Throwable cause) {
        super(message, cause);
    }
}
