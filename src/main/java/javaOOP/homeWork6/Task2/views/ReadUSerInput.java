package javaOOP.homeWork6.Task2.views;

import javaOOP.homeWork6.Task2.models.Note;


public interface ReadUSerInput {
    String readString();
    int readInt();
    Note collectDataToUpdateNote(Note note);
}
