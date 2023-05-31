package javaOOP.homeWork6.Task2.views;

import javaOOP.homeWork6.Task2.models.Note;

import java.util.List;

public interface IView {
    void showMenu();
    void showMessage(String message);
    List<String> showNotes(List<Note> notes, String delimiter);
}
