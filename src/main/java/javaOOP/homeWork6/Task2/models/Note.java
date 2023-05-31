package javaOOP.homeWork6.Task2.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note implements NoteToString {
    private int id;
    private String title;
    private String text;
    private String dateAndTime;

    public Note() {
        this.dateAndTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public Note(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.dateAndTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String noteToString(String delimiter) {
        return id + delimiter +
                title + delimiter +
                text + delimiter +
                dateAndTime;
    }
}
