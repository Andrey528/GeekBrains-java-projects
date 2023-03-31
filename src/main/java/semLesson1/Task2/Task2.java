package semLesson1.Task2;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Task2 {

    public static void hello() {
//Написать программу, которая попросит пользователя ввести <Имя> в консоли.
//Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!”
//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String userName = scanner.next();
        System.out.println("Привет, " + userName);
        LocalDateTime now = LocalDateTime.now();
        if (now.isAfter(ChronoLocalDateTime.from(LocalTime.of(5,0))) &&
                now.isBefore(ChronoLocalDateTime.from(LocalTime.of(11,59)))) {
            System.out.println("Доброе утро, " + userName);
        } else if (now.isAfter(ChronoLocalDateTime.from(LocalTime.of(12,0))) &&
                now.isBefore(ChronoLocalDateTime.from(LocalTime.of(17,59)))) {
            System.out.println("Добрый день, " + userName);
        }  else if (now.isAfter(ChronoLocalDateTime.from(LocalTime.of(12,0))) &&
                now.isBefore(ChronoLocalDateTime.from(LocalTime.of(17,59)))) {
            System.out.println("Добрый вечер, " + userName);
        } else {
            System.out.println("Доброй ночи, " + userName);
        }
    }
}
