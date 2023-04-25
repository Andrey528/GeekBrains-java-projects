package javaOOP.semLessonAndHW3.models;

import javaOOP.semLessonAndHW3.models.base.Polygon;


public class Rectangle extends Polygon {
    public Rectangle(Double[] sidesLength) {
        super("Rectangle", sidesLength);
        this.name = determineRectangle(sidesLength);
    }

    private String determineRectangle(Double[] sidesLength) {
        switch (sidesLength.length) {
            case 1:
                return "Square";
            case 2:
                if (sidesLength[0] == sidesLength[1]) return "Square";
                else return "Rectangle";
            default:
                return "Not a rectangle";
        }
    }

    @Override
    public Double getArea() {
        if (name.equals("Square")) return sidesLength[0] * sidesLength[0];
        else if (name.equals("Rectangle")) return sidesLength[0] * sidesLength[1];
        else return 0.0;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", area=" + getArea() + '}';
    }
}
