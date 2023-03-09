package Exceptions;

public class CarlsonException extends RuntimeException {
    public CarlsonException() {
        super();
    }
    
    public CarlsonException(String message) {
        super(message);
    }
}