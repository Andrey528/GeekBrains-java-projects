package javaOOP.semLesson2.models.base;

public abstract class SchoolBoy {
    private Integer numberOfClass;
    private String literaOfClass;

    public SchoolBoy(Integer numberOfClass, String literaOfClass) {
        this.numberOfClass = numberOfClass;
        this.literaOfClass = literaOfClass;
    }

    public abstract void study();
}
