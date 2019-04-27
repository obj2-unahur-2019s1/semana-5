package ar.edu.unahur.obj2.excepciones;

public class NumeroMenorACeroException extends Exception {

    public NumeroMenorACeroException(String message) {
        super(message);
    }

    public NumeroMenorACeroException(String message, Throwable cause) {
        super(message, cause);
    }
}



