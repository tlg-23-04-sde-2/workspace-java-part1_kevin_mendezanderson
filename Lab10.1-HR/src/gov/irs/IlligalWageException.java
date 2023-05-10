package gov.irs;

public class IlligalWageException extends Exception{

    public IlligalWageException() {
        super();
    }

    public IlligalWageException(String message) {
        super(message);
    }

    public IlligalWageException(String message, Throwable cause) {
        super(message, cause);
    }

    public IlligalWageException(Throwable cause) {
        super(cause);
    }
}