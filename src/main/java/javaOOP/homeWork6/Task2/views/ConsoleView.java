package javaOOP.homeWork6.Task2.views;

import javaOOP.homeWork6.Task2.models.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleView implements IView, ReadUSerInput {
    private final Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void showMenu() {
        showMessage("""
                Выберите из меню ("0" - стоп):\s
                1. Добавить записку;
                2. Удаление записки;
                3. Изменение записки;
                4. Вывести все записки;
                5. Сохранить в JSON.""");
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
    public Note collectDataToUpdateNote(Note note) {
        Note updateNoteInfo = new Note();
        updateNoteInfo.setId(note.getId());
        showMessage("Let's add a new string value (\"0\" - to skip field):");
        for (int i = 0; i < 2; i++) {
            Object input;
            switch (i) {
                case 0 -> {
                    input = readString();
                    if (!((String) input).equals("0")) updateNoteInfo.setTitle((String) input);
                    else updateNoteInfo.setTitle(note.getTitle());
                }

                case 1 -> {
                    input = readString();
                    if (!((String) input).equals("0")) updateNoteInfo.setText((String) input);
                    else updateNoteInfo.setText(note.getText());
                }
            }
        }
        return updateNoteInfo;
    }

    @Override
    public List<String> showNotes(List<Note> notes, String delimiter) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < notes.size(); i++) {
            result.add(notes.get(i).noteToString(delimiter));
        }
        return result;
    }
}
