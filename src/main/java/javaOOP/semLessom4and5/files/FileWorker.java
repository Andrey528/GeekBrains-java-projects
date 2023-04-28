package javaOOP.semLessom4and5.files;

import java.io.IOException;

public interface FileWorker {
    void writeFile(String filename, String text) throws IOException;
    String readFile(String filename);
}
