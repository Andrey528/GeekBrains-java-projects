package javaOOP.homeWork6.Task2.presenters;

import javaOOP.homeWork6.Task2.models.SavingFormat;
import javaOOP.homeWork6.Task2.views.ConsoleView;
import javaOOP.homeWork6.Task2.models.NoteCollector;
import javaOOP.homeWork6.Task2.models.Note;

import java.util.List;

public class ConfigPresenter {
    private ConsoleView view;
    private NoteCollector noteCollector;

    public ConfigPresenter(ConsoleView view, NoteCollector noteCollector) {
        this.view = view;
        this.noteCollector = noteCollector;
    }

    private void processInput(int choose) {
        switch (choose) {
            case 1 -> {
                view.showMessage("""
                        Let's add new note. Scheme is:
                        String title; 
                        String text.
                        """);
                view.showMessage(noteCollector.addNote(new Note(
                        noteCollector.getLength(),
                        view.readString(),
                        view.readString()
                )));
            }

            case 2 -> {
                view.showMessage("Select index of deleting note");
                List<String> noteData = view.showNotes(noteCollector.getAllNotes(), ", ");
                noteData.forEach(item -> view.showMessage(item));
                view.showMessage(noteCollector.deleteNote(view.readInt()));
            }

            case 3 -> {
                view.showMessage("Select index to change note info");
                List<String> noteData = view.showNotes(noteCollector.getAllNotes(), ", ");
                noteData.forEach(item -> view.showMessage(item));
                int index = view.readInt();
                Note note = noteCollector.getNote(index);
                view.showMessage(note.noteToString(", "));
                if (note.toString() != "Can't find note by input index") {
                    Note updateNoteData = view.collectDataToUpdateNote(note);
                    noteCollector.setNoteData(index, updateNoteData);
                }
            }

            case 4 -> {
                List<String> notesData = view.showNotes(noteCollector.getAllNotes(), ", ");
                notesData.forEach(item -> view.showMessage(item));
            }

            case 5 -> {
                SavingFormat saver = new SavingFormat("notes", noteCollector);
                saver.saveToJson();
            }

            default -> {
                view.showMessage("Error in options");
            }
        }

    }

    public void buttonClick() {
        while(true){
            view.showMenu();
            int choose = view.readInt();
            if(choose==0)
                break;
            if(choose < 0 || choose > 8) {
                view.showMessage("Error in choose. Please enter value from 0 to 16");
                continue;
            }
            processInput(choose);
        }
    }
}
