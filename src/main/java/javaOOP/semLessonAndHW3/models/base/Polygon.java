package javaOOP.semLessonAndHW3.models.base;

import java.util.Arrays;

public class Polygon extends Figure implements Perimeter {
    protected Double[] sidesLength;

    public Polygon(String name, Double[] sidesLength) {
        super(name);
        this.sidesLength = sidesLength;
    }


    public void setSidesLength(Double[] sidesLength) {
        this.sidesLength = sidesLength;
    }

    public Double[] getSidesLength() {
        return sidesLength;
    }

    @Override
    public Double getPerimetr() {
        Double perimetr = 0.0;
        for (int i = 0; i < sidesLength.length; i++) {
            perimetr += sidesLength[i];
        }
        return perimetr;
    }

    @Override
    public Double getArea() {
        return null;
    }

    @Override
    public String toString() {
        return name + "{sidesLength=" + Arrays.toString(sidesLength) +
                ", perimeter=" + getPerimetr() + '}';
    }
}
