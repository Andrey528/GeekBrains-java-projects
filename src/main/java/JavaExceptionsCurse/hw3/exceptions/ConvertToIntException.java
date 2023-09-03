package JavaExceptionsCurse.hw3.exceptions;


public class ConvertToIntException extends NumberFormatException {
    private int errorCode;

    public ConvertToIntException(String message) {
        super(message);
        this.errorCode = 3;
    }

    @Override
    public String toString() {
        return "Код ошибки: " + errorCode + ". " + getMessage();
    }
}
