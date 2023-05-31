package javaOOP.homeWork6.Task2.models;

import java.io.FileWriter;
import java.io.IOException;

public class SavingFormat implements Savable{
    private String fileName;
    private NoteCollector notes;

    public SavingFormat(String fileName, NoteCollector notes) {
        this.fileName = fileName;
        this.notes = notes;
    }

    @Override
    public void saveToJson() {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (int i = 0; i < notes.getLength(); i++) {
                writer.write("{\n");
                writer.write("\"id\":\"" + notes.getNote(i).getId() + "\",\n");
                writer.write("\"title\":\"" + notes.getNote(i).getTitle() + "\",\n");
                writer.write("\"text\":" + notes.getNote(i).getText() + ",\n");
                writer.write("\"date\":" +  notes.getNote(i).getDateAndTime() + "\n");
                writer.write("}\n");
                writer.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
