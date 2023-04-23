package javaOOP.semLesson2.models;

import javaOOP.semLesson2.models.base.Cards;
import javaOOP.semLesson2.models.base.GameJuniorMiddle;
import javaOOP.semLesson2.models.base.SchoolBoy;
import javaOOP.semLesson2.models.base.Smoking;

public class MiddleSchoolBoy extends SchoolBoy implements GameJuniorMiddle, Smoking, Cards {
    public MiddleSchoolBoy(Integer numberOfClass, String literaOfClass) {
        super(numberOfClass, literaOfClass);
    }

    @Override
    public void study() {
        System.out.println("I hate learning");
    }

    @Override
    public void game() {
        System.out.println("I'm playing in Minecraft");
    }

    @Override
    public void isSmoking() {
        System.out.println("Start smoking");
    }

    @Override
    public void playCards() {
        System.out.println("I'm playing in Mafia");
    }
}
