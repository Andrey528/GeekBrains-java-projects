package javaOOP.homeWork6.Task2;

import javaOOP.homeWork6.Task2.models.Note;
import javaOOP.homeWork6.Task2.models.NoteCollector;
import javaOOP.homeWork6.Task2.views.ConsoleView;
import javaOOP.homeWork6.Task2.presenters.ConfigPresenter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Написать проект, "Записки", содержащий работу с записками из консоли (можно прочитать все записки, создать
 * одну записку, отредактировать записку, удалить, и прочитать одну записку по ID), записка содержит в себе как
 * минимум 3 поля: Id, заголовок и текст, можно добавить дату. Хранение по вашему выбору, можно в текстовом
 * файле (или каждая записка в одном файле, как вам удобнее). Можно сделать по аналогии с программой из 5 урока.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Note> notesList = new ArrayList<>();
        notesList.add(new Note(0, "Cutusov", "adress1"));
        notesList.add(new Note(1, "Michalkov", "adress2"));
        notesList.add(new Note(2, "Petrov", "adress3"));

        ConsoleView view = new ConsoleView(new Scanner(System.in));
        NoteCollector arrayHandler = new NoteCollector(notesList);
        ConfigPresenter presenter = new ConfigPresenter(view, arrayHandler);
        presenter.buttonClick();
    }
}