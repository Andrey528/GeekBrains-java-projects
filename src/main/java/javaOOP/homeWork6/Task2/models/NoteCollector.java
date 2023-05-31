package javaOOP.homeWork6.Task2.models;

import java.util.ArrayList;
import java.util.List;

public class NoteCollector {
    private ArrayList<Note> notesCollector;
    private Integer length;

    public NoteCollector() {
        this.notesCollector = new ArrayList<>();
        this.length = notesCollector.size();
    }

    public NoteCollector(ArrayList<Note> notesCollector) {
        this.notesCollector = notesCollector;
        this.length = notesCollector.size();
    }

    public Integer getLength() {
        return length;
    }

    public String addNote(Note note) {
        if (notesCollector.add(note)) {
            length = notesCollector.size();
            return "Success";
        }
        else return "Fail to add note";
    }

    public String deleteNote(Integer index){
        if (length != 0 && 0 <= index && index < length) {
            notesCollector.remove((int) index);
            length = notesCollector.size();
            return "Success";
        }
        else return "Fail to remove note";
    }

    public String setNoteData(int index, Note note) {
        if (0 <= index && index < length) {
            notesCollector.set(index, note);
            return "Success";
        }
        else return "Unable to set note info";
    }

    public Note getNote (Integer index) {
        if (length != 0 && 0 <= index && index < length) return notesCollector.get(index);
        else return null;
    }

    public List<Note> getAllNotes () {
        List<Note> result = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            result.add(getNote(i));
        }
        return result;
    }
}
