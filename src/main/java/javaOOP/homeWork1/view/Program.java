package javaOOP.homeWork1.view;

import javaOOP.homeWork1.models.*;
import javaOOP.homeWork1.models.base.*;

import java.util.Arrays;

/**
 *Реализовать класс товар, содержащий следующие свойства:
 * 1. Название
 * 2. Цена
 * 3. Количество
 * 4. Единица измерения
 * А так же реализовать следующие классы-наследники:
 * 1. Продукты питания, содержащие следующие свойства:
 * 1.1 Срок годности
 * 2. Напитки, содержащие следующие свойства:
 * 2.1 Объём
 * 3. Предметы гигиены, содержащие следующие свойства:
 * 3.1 Количество штук в упаковке
 * 4. Детские товары:
 * 4.1 Минимальный возраст
 * 4.2 Гипоаллергенность,
 * А так же реализовать слеюущие классы, наследуемые от приведённых выше классов(надеюсь сами разберётесь от каких именно):
 * 5. Молоко, содержащиее следующее свойство:
 * 5.1 Процент жирности
 * 5.2 Срок годности
 * 6. Лимонад
 * 7. Хлеб, содержащий следующие свойство:
 * 7.1 Тип муки
 * 8. Яйца, содержащее следующиее свойство:
 * 8.1 Количество в упаковке
 * 9. Маски
 * 10. Туалетная бумага, содержащее следующее свойство:
 * 10.1 Количество слоёв
 * 11. Подгузники, содержащие следующее свойства:
 * 11.1 Размер
 * 11.2 Минимальный вес
 * 11.3 Максимальный вес
 * 11.4 Тип
 * 12. Соска
 * У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы, в котором будет
 * происходить вывод всей информации о товаре, так же реализовать конструкторы, принемающие все поля.
 * Реализовать в классе Program, метод выводящий все данные о товаре. Создать в Main все объекты товаров и проверить
 * работу метода, созданного в классе Program
 */
public class Program {
    public static void main(String[] args) {
        Good[] listOfGoods = {
                new Bread(25, 2, "27.04", "rye"),
                new ChildrensGoods("beanbag", 300, 1, "item", 0, true),
                new Diapers(5000, 50, 1, true, "l", 7, 12, "absorbing"),
                new Drinks("Bear", 240, 1, "l", 2),
                new Eggs(70, 10, "5.05", 10),
                new Food("Apple", 120, 1, "kg", "04.05"),
                new HygieneItems("Cotton", 140, 1, "package", 100),
                new Lemonade(65, 1, 2),
                new Masks(450, 1, 3),
                new Milk(82, 1, 900, 3.2, "30.04"),
                new Pacifier(500, 1, 0, true),
                new ToiletPaper(320, 1, 12, 3)
        };

        Arrays.stream(listOfGoods).forEach(item -> printObject(item));
    }

    private static void printObject(Good good) {
        System.out.println(good.toString());
    }
}
