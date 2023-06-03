package javaOOP.homeWork7.views;

import javaOOP.homeWork7.views.IView;
import javaOOP.homeWork7.views.ReadUserInput;

import java.util.Scanner;

public class ConsoleView implements IView, ReadUserInput {
    private final Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void showMenu() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public int readInt() {
        return 0;
    }
}
