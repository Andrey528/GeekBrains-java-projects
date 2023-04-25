package javaOOP.semLessonAndHW3.models.base;

public abstract class Figure {
    protected String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract Double getArea();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
