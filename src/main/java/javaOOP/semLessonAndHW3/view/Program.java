package javaOOP.semLessonAndHW3.view;

/**
 * Написать программу на языках Java, в которой идёт со следующими геометрическими фигурами:
 * 1.Треугольник
 * 2.Квадрат
 * 3.Прямоугольник
 * 4.Круг
 * В программе имеется массив фигур, с которым можно сделать следующие операции:
 * 1.Добавить новую фигуру
 * 2.Посчитать периметр у всех фигур
 * 3.Посчитать площадь у всех фигур
 * Для фигуры использовать базовый абстрактный класс фигуры, у которого есть методы посчитать периметр и посчитать
 * площадь фигуры.
 * Создать класс-коллекцию фигур В классе-коллекции реализовать методы6
 * 1. Dывода информации о всех периметах, площадях и длиннах окружности всех фигур, где это возможно,
 * 2. добавления новой фигуры,
 * 3. удаления фигуры,
 * 4. изменения фигуры по ндексу,
 * 5. сортировки по площади, вывод информации о всех фигурах.
 * При создании фигур необходимо осуществлять проверку входных данных на возможность создания данной фигуры и в случае
 * ошибки выдавать соответствующие сообщения. Перодумать собственную иерархию исключений
 */
public class Program {
    public static void main(String[] args) {
        Repository repository = new Repository();
        repository.repInterface();
    }
}
