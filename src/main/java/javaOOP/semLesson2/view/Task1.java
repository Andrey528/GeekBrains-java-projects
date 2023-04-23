package javaOOP.semLesson2.view;

import javaOOP.semLesson2.models.base.*;
import javaOOP.semLesson2.models.JuniorSchoolBoy;
import javaOOP.semLesson2.models.MiddleSchoolBoy;
import javaOOP.semLesson2.models.SeniorSchoolBoy;
import javaOOP.semLesson2.models.base.*;

import java.util.Arrays;

/**
 * Реализовать следующую иерархию школьников:
 * 1. Младшеклассник, реализующий следующие методы:
 * 1.1. Учиться, выводящий на экран фразу "Я люблю учиться"
 * 1.2. Играть, выводящий на экран фразу "Я люблю игрушки"
 * 1.3. Ходить в продленку, выводящий на экран фразу "Я хожу в продленку"
 * 2. Ученик средней школы, реализующий следующие методы:
 * 2.1. Учиться, выводящий на экран фразу "Я ненавижу учиться"
 * 2.2. Играть, выводящий на экран фразу "Я играю в Minecraft"
 * 2.3. Курить, выводящий на экран фразу "Я начинаю курить"
 * 2.4. Играть в карты, выводящий на экран фразу "Я играю в мафию"
 * 3. Старшеклассник, реализующий следующие методы:
 * 3.1. Учиться, выводящий на экран фразу "Я должен учиться"
 * 3.2. Курить, выводящий на экран фразу "Я бросаю курить"
 * 3.3. Посетить военкомат, выводящий на экран фразу "Боюсь военкома"
 * 3.4. Учиться на права, выводящий на экран фразу "Я хочу водить"
 * В методе main класса Program создать объекты всех школьников, и для каждого объекта вывать метод, описанный в классе Program и
 * вызывающий все методы переданного школьника
 */
public class Task1 {
    public static void main(String[] args) {
        SchoolBoy[] schoolBoys = {
                new JuniorSchoolBoy(2, "A"),
                new MiddleSchoolBoy(8, "B"),
                new SeniorSchoolBoy(10, "C")
        };

        Arrays.stream(schoolBoys).forEach(item -> getInfo(item));
    }

    private static void getInfo(SchoolBoy schoolBoy) {
        schoolBoy.study();
        if(schoolBoy instanceof GameJuniorMiddle gameJuniorMiddle) {
            gameJuniorMiddle.game();
        }
        if(schoolBoy instanceof Aftercare aftercare) {
            aftercare.isAftercare();
        }
        if(schoolBoy instanceof Army army) {
            army.isVoenkomat();
        }
        if(schoolBoy instanceof Cards cards) {
            cards.playCards();
        }
        if(schoolBoy instanceof DriverLicense driverLicense) {
            driverLicense.isStudyingDrive();
        }
        if(schoolBoy instanceof Smoking smoking) {
            smoking.isSmoking();
        }
    }
}
