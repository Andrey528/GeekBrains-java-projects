package javaOOP.semLessonAndHW3.models;

import javaOOP.semLessonAndHW3.models.base.CurveLength;
import javaOOP.semLessonAndHW3.models.base.Figure;

public class Circle extends Figure implements CurveLength {
    private Double radius;

    public Circle(Double radius) {
        super("Circle");
        this.radius = radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public Double getCurveLength() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return name + "{radius=" + radius +
                ", curveLength=" + getCurveLength() +
                ", area=" + getArea() + '}';
    }
}
