package javaToyRaffle;

import javaToyRaffle.models.FileHandler;
import javaToyRaffle.models.Toy;
import javaToyRaffle.models.ToyHandler;
import javaToyRaffle.presenters.ConfigPresenter;
import javaToyRaffle.views.ConsoleView;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.
 * Стараемся применять ООП и работу с файлами.
 * Если какой-то пункт не изучали и не знаете, как сделать, то можете сделать своим способом. Например, у кого в курсе не было ООП, то применяем списки\массивы\словари
 *
 * Желательный функционал программы:
 * В программе должен быть минимум один класс со следующими свойствами:
 * id игрушки,
 * текстовое название,
 * количество
 * частота выпадения игрушки (вес в % от 100)
 *
 * Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
 * Возможность организовать розыгрыш игрушек.
 */

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("toys.json");
        ArrayList<Toy> toys = fileHandler.getToys();
        ConsoleView view = new ConsoleView(new Scanner(System.in));
        ToyHandler toyHandler = toys == null ? new ToyHandler() : new ToyHandler(toys);
        ConfigPresenter presenter = new ConfigPresenter(view, toyHandler, fileHandler);
        presenter.buttonClick();
    }
}
