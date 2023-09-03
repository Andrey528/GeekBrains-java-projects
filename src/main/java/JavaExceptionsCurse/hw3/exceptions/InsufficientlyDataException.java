package JavaExceptionsCurse.hw3.exceptions;

public class InsufficientlyDataException extends RuntimeException{
    private int errorCode;
    private int dataLength;

    public InsufficientlyDataException(String message, int dataLength) {
        super(message);
        this.errorCode = 1;
        this.dataLength = dataLength;
    }

    @Override
    public String toString() {
        return "Код ошибки: " + errorCode + ". " + getMessage() + dataLength;
    }
}
