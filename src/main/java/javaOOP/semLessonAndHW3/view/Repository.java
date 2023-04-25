package javaOOP.semLessonAndHW3.view;

import javaOOP.semLessonAndHW3.models.Circle;
import javaOOP.semLessonAndHW3.models.Rectangle;
import javaOOP.semLessonAndHW3.models.Triangle;
import javaOOP.semLessonAndHW3.models.base.CurveLength;
import javaOOP.semLessonAndHW3.models.base.Figure;
import javaOOP.semLessonAndHW3.models.base.Polygon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repository {
    List<Figure> figures = new ArrayList();

    private void preFillArrayOfFigures(){
        figures.add(new Rectangle(new Double[]{2.2, 3.0}));
        figures.add(new Rectangle((new Double[]{4.0})));
        figures.add(new Triangle((new Double[]{3.0, 3.0, 3.0})));
        figures.add(new Circle(5.0));
    }

    private void printFigure (Integer index) {
        if (figures.size() != 0 && 0 <= index && index < figures.size()) System.out.printf(figures.get(index).toString());
        else System.out.println("Элемент под таким индексом не может быть получен");
    }

    private void printAllFigures () {
        for (int i = 0; i < figures.size(); i++) {
            System.out.print(i + ") ");
            printFigure(i);
            System.out.println();
        }
    }

    private Object getUserInput(String message, String dataType) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        switch (dataType) {
            case "str":
                return scanner.next();
            case "int":
                return scanner.nextInt();
            case "boolean":
                return scanner.nextBoolean();
            case "double":
                return scanner.nextDouble();
            default:
                System.out.println("Нет такого варианта)");
                return 0;
        }
    }

    private void addFigure () {
        boolean stop = false;
        while (!stop) {
            String message = "Выберите из меню (\"q\" - стоп): " +
                    "\n1. Добавить треугольник;" +
                    "\n2. Добавить квадрат;" +
                    "\n3. Добавить прямоугольник;" +
                    "\n4. Добавить круг.";
            Object input = getUserInput(message, "str");

            switch ((String) input) {
                case "q":
                    stop = true;
                    break;
                case "1":
                    figures.add(new Triangle(new Double[]{
                            (Double) getUserInput("firstSide", "double"),
                            (Double) getUserInput("secondSide", "double"),
                            (Double) getUserInput("thirdSide", "double")}));
                    break;
                case "2":
                    figures.add(new Rectangle(new Double[]{
                            (Double) getUserInput("side", "double")
                    }));
                    break;
                case "3":
                    figures.add(new Rectangle(new Double[]{
                            (Double) getUserInput("firstSide", "double"),
                            (Double) getUserInput("secondSide", "double")
                    }));
                    break;
                case "4":
                    figures.add(new Circle((Double) getUserInput("radius", "double")));
                    break;
                default:
                    System.out.println("Нет такого варианта)");
                    break;
            }
        }
    }

    private void deleteFigure (Integer index) {
        if (figures.size() != 0 & 0 <= index & index < figures.size()) {
            figures.remove((int) index);
        }
        else System.out.println("Элемент под таким индексом не может быть удален");
    }

    private void changeFigure (Integer index) {
        if (figures.size() != 0 & 0 <= index & index < figures.size()) {
            printFigure(index);
            changeInterface(index);
        }
        else System.out.println("Элемент под таким индексом не может быть удален\n");
    }

    private void changeInterface(Integer index) {
        if (figures.get(index) instanceof Rectangle)
        {
            if (figures.get(index).getName().equals("Square"))
                ((Rectangle) figures.get(index)).setSidesLength(new Double[]{
                        (Double) getUserInput("side", "double")
                });
            else ((Rectangle) figures.get(index)).setSidesLength(new Double[]{
                    (Double) getUserInput("firstSide", "double"),
                    (Double) getUserInput("secondSide", "double")
            });
        }
        else if (figures.get(index) instanceof Triangle)
        {
            ((Triangle) figures.get(index)).setSidesLength(new Double[]{
                    (Double) getUserInput("firstSide", "double"),
                    (Double) getUserInput("secondSide", "double"),
                    (Double) getUserInput("thirdSide", "double")
            });
        }
        else if (figures.get(index) instanceof Circle)
        {
            ((Circle) figures.get(index)).setRadius((Double) getUserInput("radius", "double"));
        }
        else System.out.println("Неопознанный запущенный объект");
    }

    private void sortByArea() {
        for (int i = 0; i < figures.size() - 1; i++) {
            for (int j = 0; j < figures.size() - i - 1; j++) {
                if (figures.get(j).getArea() > figures.get(j + 1).getArea())
                {
                    System.out.println("yes");
                    Figure temp = figures.get(j);
                    figures.set(j, figures.get(j + 1));
                    figures.set(j + 1, temp);
                }
            }
        }
    }

    public void repInterface() {
        preFillArrayOfFigures();

        boolean stop = false;
        while (!stop) {
            String message = "Выберите из меню (\"q\" - стоп): " +
                    "\n1. Распечатай массив фигур;" +
                    "\n2. Добавить новую фигуру;" +
                    "\n3. Посчитать периметр у всех фигур;" +
                    "\n4. Посчитать площадь у всех фигур;" +
                    "\n5. Посчитать длины окружностей у всех фигур;" +
                    "\n6. Удаление фигуры;" +
                    "\n7. Изменение фигуры;" +
                    "\n8. Сортировка по площади.";


            Object input = getUserInput(message, "str");

            switch ((String) input) {
                case "q":
                    stop = true;
                    break;
                case "1":
                    printAllFigures();
                    break;
                case "2":
                    addFigure();
                    break;
                case "3":
                    for (Figure figure : figures) {
                        if (figure instanceof Polygon polygon) System.out.println(polygon.toString());
                    }
                    break;
                case "4":
                    for (Figure figure : figures) {
                        System.out.println(figure.toString());
                    }
                    break;
                case "5":
                    for (Figure figure : figures) {
                        if (figure instanceof CurveLength curve) System.out.println(curve.toString());
                    }
                    break;
                case "6":
                    printAllFigures();
                    deleteFigure((int) getUserInput("Введите индекс удаляемой фигуры", "int"));
                    break;
                case "7":
                    printAllFigures();
                    changeFigure((int) getUserInput("Введите индекс просматриваемой фигуры", "int"));
                    break;
                case "8":
                    sortByArea();
                    printAllFigures();
                    break;
                default:
                    System.out.println("Нет такого варианта)");
                    break;
            }
        }
    }
}
