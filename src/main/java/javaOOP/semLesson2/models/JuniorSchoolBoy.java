package javaOOP.semLesson2.models;

import javaOOP.semLesson2.models.base.Aftercare;
import javaOOP.semLesson2.models.base.GameJuniorMiddle;
import javaOOP.semLesson2.models.base.SchoolBoy;

public class JuniorSchoolBoy extends SchoolBoy implements GameJuniorMiddle, Aftercare {
    public JuniorSchoolBoy(Integer numberOfClass, String literaOfClass) {
        super(numberOfClass, literaOfClass);
    }

    @Override
    public void study() {
        System.out.println("I love learning");
    }

    @Override
    public void game() {
        System.out.println("I'm playing games");
    }

    @Override
    public void isAftercare() {
        System.out.println("Aftercare");
    }
}
