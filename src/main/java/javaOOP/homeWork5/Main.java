package javaOOP.homeWork5;

import javaOOP.homeWork5.models.FormatWorker;
import javaOOP.homeWork5.models.PhoneBook;
import javaOOP.homeWork5.models.PhoneUserScheme;
import javaOOP.homeWork5.models.SavingFormat;
import javaOOP.homeWork5.presenters.ConfigPresenter;
import javaOOP.homeWork5.views.ConsoleView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
 * под форматами понимаем структуру файлов, например:
 * - в файле на одной строке хранится одна часть записи, пустая строка - разделитель
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<PhoneUserScheme> contactList = new ArrayList<>();
        contactList.add(new PhoneUserScheme("Alex", "Cutusov", new ArrayList<>(Arrays.asList("999", "222")), "adress1"));
        contactList.add(new PhoneUserScheme("Vadim", "Michalkov", new ArrayList<>(Arrays.asList("777", "111")), "adress2"));
        contactList.add(new PhoneUserScheme("Robert", "Petrov", new ArrayList<>(Arrays.asList("444", "333")), "adress3"));

        ArrayList<SavingFormat> savingFormatList = new ArrayList<>();
        savingFormatList.add(new SavingFormat("Space", " "));
        savingFormatList.add(new SavingFormat("Space with comma", ", ", true));

        ConsoleView view = new ConsoleView(new Scanner(System.in));
        PhoneBook arrayHandler = new PhoneBook(contactList);
        FormatWorker formatWorker = new FormatWorker(savingFormatList);
        ConfigPresenter presenter = new ConfigPresenter(view, arrayHandler, formatWorker);
        presenter.buttonClick();
    }
}
