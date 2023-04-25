package javaOOP.semLessonAndHW3.models;

import javaOOP.semLessonAndHW3.models.base.Polygon;

public class Triangle extends Polygon  {
    public Triangle(Double[] sidesLength) {
        super("Triangle", sidesLength);
        if ((sidesLength[0] <= 0.0 || sidesLength[1] <= 0.0 || sidesLength[2] <= 0.0) ||
        !(sidesLength[0] + sidesLength[1] > sidesLength[2] && sidesLength[0] + sidesLength[2] > sidesLength[1] &&
                sidesLength[1] + sidesLength[2] > sidesLength[0])) System.out.println("Неправильные стороны");;
    }

    @Override
    public Double getArea() {
        Double p = getPerimetr() / 2;
        return Math.sqrt(p * (p - sidesLength[0]) * (p - sidesLength[1]) * (p - sidesLength[2]));
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", area=" + getArea() + '}';
    }
}
