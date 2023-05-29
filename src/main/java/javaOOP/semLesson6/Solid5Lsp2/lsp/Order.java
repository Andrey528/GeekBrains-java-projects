package javaOOP.semLesson6.Solid5Lsp2.lsp;

public class Order extends OrderAbstract {
    public Order(int price, int qnt) {
        super(price, qnt);
    }

    public int getAmount() {
        return qnt * price;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
