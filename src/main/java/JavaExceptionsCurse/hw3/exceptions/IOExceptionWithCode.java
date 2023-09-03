package JavaExceptionsCurse.hw3.exceptions;

import java.io.IOException;

public class IOExceptionWithCode extends IOException {
    private int errorCode;

    public IOExceptionWithCode(String message) {
        super(message);
        this.errorCode = 4;
    }

    @Override
    public String toString() {
        return "Код ошибки: " + errorCode + ". " + getMessage();
    }
}
