package javaToyRaffle.views;

import javaToyRaffle.views.ReadUserInput;

import java.util.Scanner;

public class ConsoleView implements IView, ReadUserInput {
    private final Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void showMenu() {
        showMessage("""
                Выберите из меню ("0" - стоп):\s
                1. Добавить игрушку;
                2. Вывести все игрушки;
                3. Провести розыгрыш.""");
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String readString() {
        return scanner.next();
    }

    @Override
    public int readInt() {
        return scanner.nextInt();
    }

    @Override
    public double readDouble() {
        return scanner.nextDouble();
    }
}
