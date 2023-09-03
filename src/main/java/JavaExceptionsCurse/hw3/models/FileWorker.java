package JavaExceptionsCurse.hw3.models;

import JavaExceptionsCurse.hw3.exceptions.IOExceptionWithCode;
import JavaExceptionsCurse.hw3.models.base.Savable;

import java.io.FileWriter;
import java.io.IOException;

public class FileWorker implements Savable {
    private String fileName;
    private User user;

    public FileWorker(String fileName, User user) {
        this.fileName = fileName;
        this.user = user;
    }

    @Override
    public boolean saveToTxt() throws IOExceptionWithCode{
        try (FileWriter writer = new FileWriter("./newDir/" + fileName + ".txt", true)) {
                writer.write(user.toString() + "\n");
                writer.flush();
        } catch (IOException e) {
            throw new IOExceptionWithCode("Ошибка при записи файла");
        }
        return true;
    }
}
