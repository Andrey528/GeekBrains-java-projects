package semLesson2.Task3;

import java.io.FileWriter;
import java.io.IOException;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
public class Task3 {
    private static String createTestString(String arg) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(arg).repeat(100));
        return sb.toString();
    }

    public static boolean writeString(String arg) {
        String str = createTestString(arg);
        try (FileWriter in = new FileWriter("test.txt")) {
            in.append(str);
            System.out.println("Recorded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
