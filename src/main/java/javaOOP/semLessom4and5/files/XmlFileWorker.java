package javaOOP.semLessom4and5.files;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class XmlFileWorker implements FileWorker {
    @Override
    public void writeFile(String filename, String text) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("config.xml")))) {
            writer.write(text);
        }
        catch (Exception ex) {
            throw new IOException("File was not written");
        }
    }

    @Override
    public String readFile(String filename) {
        return null;
    }
}
