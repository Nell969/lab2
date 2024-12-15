package exceptions;

public class InvalidMeteringException extends RuntimeException {
    public InvalidMeteringException(String message) {
        super(message);
    }
}