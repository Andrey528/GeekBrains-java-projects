package javaOOP.semLessom4and5.views;

import javaOOP.semLessom4and5.views.base.IView;
import java.util.Scanner;

public class ConsoleView implements IView {
    private final Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMenu(){
        System.out.println("1. Добавить опцию печати");
        System.out.println("2. Добавить информацию о принтере");
        System.out.println("3. Прочитать конфигурации XML");
        System.out.println("4. Сохранить конфигурации XML");
        System.out.println("0. Выход");
    }

    @Override
    public void showMessage(String message) {
        System.out.print(message);
    }

    @Override
    public int readInt() {
        return scanner.nextInt();
    }

    @Override
    public String readString() {
        return scanner.nextLine();
    }

    @Override
    public boolean readBoolean() {
        return scanner.nextBoolean();
    }
}
