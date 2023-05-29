package javaOOP.semLesson6.Solid5Lsp2.lsp;

public class OrderBonus extends OrderAbstract {
    public OrderBonus(int price, int qnt) {
        super(price, qnt);
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return "OrderBonus{" +
                "price=" + price +
                ", qnt=" + qnt +
                '}';
    }
}
