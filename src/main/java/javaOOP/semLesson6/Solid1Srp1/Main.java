package javaOOP.semLesson6.Solid1Srp1;

import javaOOP.semLesson6.Solid1Srp1.srp.Point;
import javaOOP.semLesson6.Solid1Srp1.srp.Square;
import javaOOP.semLesson6.Solid1Srp1.srp.CalcSquare;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        CalcSquare calc = new CalcSquare(square.getSide());
        System.out.printf("Площадь фигуры: %d \n", calc.gerArea());
        square.drawFigure(2.0);
    }
}
