package JavaExceptionsCurse.hw3.views.base;

import JavaExceptionsCurse.hw3.exceptions.ConvertToIntException;
import JavaExceptionsCurse.hw3.exceptions.InsufficientlyDataException;

import java.util.ArrayList;

public interface ReadUserInput <T> {
    String[] readLine();

    String capitalize(String word);
    int convertToInt(String text) throws ConvertToIntException;
    ArrayList<T> parseUserInput() throws InsufficientlyDataException, ConvertToIntException;
    boolean checkUserName(String name);
}
