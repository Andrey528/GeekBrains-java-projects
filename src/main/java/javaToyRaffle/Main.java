package javaToyRaffle;

import javaToyRaffle.models.FileHandler;
import javaToyRaffle.models.Toy;
import javaToyRaffle.models.ToyHandler;
import javaToyRaffle.presenters.ConfigPresenter;
import javaToyRaffle.views.ConsoleView;

import java.util.ArrayList;
import java.util.Scanner;

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
