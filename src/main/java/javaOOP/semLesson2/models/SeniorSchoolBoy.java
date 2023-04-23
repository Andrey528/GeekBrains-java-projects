package javaOOP.semLesson2.models;

import javaOOP.semLesson2.models.base.Army;
import javaOOP.semLesson2.models.base.DriverLicense;
import javaOOP.semLesson2.models.base.SchoolBoy;
import javaOOP.semLesson2.models.base.Smoking;

public class SeniorSchoolBoy extends SchoolBoy implements Smoking, Army, DriverLicense {
    public SeniorSchoolBoy(Integer numberOfClass, String literaOfClass) {
        super(numberOfClass, literaOfClass);
    }

    @Override
    public void study() {
        System.out.println("I must learning");
    }

    @Override
    public void isSmoking() {
        System.out.println("I'm breaking smoking");
    }

    @Override
    public void isVoenkomat() {
        System.out.println("Fear voenkom");
    }

    @Override
    public void isStudyingDrive() {
        System.out.println("I want to drive");
    }
}
