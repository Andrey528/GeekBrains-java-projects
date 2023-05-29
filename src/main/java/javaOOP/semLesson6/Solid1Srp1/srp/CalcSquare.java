package javaOOP.semLesson6.Solid1Srp1.srp;

public class CalcSquare implements Shape {
    private int side;

    public CalcSquare(int side) {
        this.side = side;
    }

    @Override
    public int gerArea() {
        return side * side;
    }
}
