package JavaExceptionsCurse.hw3.exceptions;

public class CheckUserNameException extends RuntimeException{
    private int errorCode;

    public CheckUserNameException(String message) {
        super(message);
        this.errorCode = 2;
    }

    @Override
    public String toString() {
        return "Код ошибки: " + errorCode + ". " + getMessage();
    }

}
