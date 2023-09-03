package JavaExceptionsCurse.hw3.models.base;

import JavaExceptionsCurse.hw3.exceptions.IOExceptionWithCode;

public interface Savable {
    boolean saveToTxt() throws IOExceptionWithCode;
}
