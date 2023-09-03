package JavaExceptionsCurse.hw3.views;

import JavaExceptionsCurse.hw3.exceptions.CheckUserNameException;
import JavaExceptionsCurse.hw3.exceptions.ConvertToIntException;
import JavaExceptionsCurse.hw3.exceptions.InsufficientlyDataException;
import JavaExceptionsCurse.hw3.views.base.IView;
import JavaExceptionsCurse.hw3.views.base.ReadUserInput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleView implements IView, ReadUserInput {
    private final Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String[] readLine() {
        return scanner.nextLine().split("\\s+");
    }

    @Override
    public String capitalize(String str)
    {
        if (str == null || str.length() == 0) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    @Override
    public boolean checkUserName(String word) {
        if (!word.matches("^[a-zA-Z]*$"))
            throw new CheckUserNameException("Текстовое поле не должно содержать цифр или символов");
        return true;
    }

    @Override
    public int convertToInt(String text) throws ConvertToIntException{
        try {
             return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new ConvertToIntException("Не верный формат ввода номера телефона");
        }
    }

    @Override
    public ArrayList parseUserInput() throws InsufficientlyDataException, ConvertToIntException{
        ArrayList correctUserData = new ArrayList();
        String[] userData = readLine();

        if (userData.length != 4)
            throw new InsufficientlyDataException("Некорректный ввод - недостаточно данных. Длина массива данных: ", userData.length);

        for (int i = 0; i < userData.length - 1; i++) {
            if (checkUserName(userData[i]))
                correctUserData.add(capitalize(userData[i]));
        }
        correctUserData.add(convertToInt(userData[userData.length - 1]));

        return correctUserData;
    }
}
