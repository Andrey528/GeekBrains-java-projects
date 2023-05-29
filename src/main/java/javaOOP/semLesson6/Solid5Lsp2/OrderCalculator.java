package javaOOP.semLesson6.Solid5Lsp2;

import javaOOP.semLesson6.Solid5Lsp2.lsp.Order;
import javaOOP.semLesson6.Solid5Lsp2.lsp.OrderAbstract;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<OrderAbstract> {
    private List<OrderAbstract> orders = new ArrayList<>();

    public void add(OrderAbstract order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (OrderAbstract order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<OrderAbstract> iterator() {
        return orders.iterator();
    }
}
