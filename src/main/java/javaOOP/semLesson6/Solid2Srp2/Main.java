package javaOOP.semLesson6.Solid2Srp2;

import javaOOP.semLesson6.Solid2Srp2.srp.models.Order;
import javaOOP.semLesson6.Solid2Srp2.srp.models.FactoryOrder;
import javaOOP.semLesson6.Solid2Srp2.srp.models.Saver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        FactoryOrder fo = new FactoryOrder();
        Order order = fo.createOrder();
        Saver saver = new Saver("order1", order);
        saver.saveToJson();
    }
}
