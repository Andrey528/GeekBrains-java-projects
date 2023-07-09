package javaToyRaffle.models;

import java.util.ArrayList;
import java.util.Random;

public class ToyHandler {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> prizeToys;
    private Random random = new Random();
    private Integer length;

    public ToyHandler() {
        this.toys = new ArrayList<>();
        this.prizeToys = new ArrayList<>();
        this.length = toys.size();
    }

    public ToyHandler(ArrayList<Toy> toys) {
        this.toys = toys;
        this.prizeToys = new ArrayList<>();
        this.length = toys.size();
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public ArrayList<Toy> getPrizeToys() {
        return prizeToys;
    }

    public Integer getLength() {
        return length;
    }

    public String addToy(Toy toy) {
        if (toys.add(toy)) {
            length = toys.size();
            return "Successfully add new toy";
        }
        else return "Fail to add toy";
    }

    public String addPrizeToy(Toy toy) {
        if (prizeToys.add(toy)) {
            return "Successfully add new prize toy";
        }
        else return "Fail to add prize toy";
    }

    public String changeToyWeight(int id, double weight) {
        for (Toy toy: toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                return "Successfully change toy weight";
            }
        }
        return "Fail to change weight";
    }

    public Toy raffle() {
        double totalWeight = 0;

        for (Toy toy: toys) {
            totalWeight += toy.getWeight();
        }

        double randomWeight = random.nextDouble() * totalWeight;
        double weightSum = 0;

        for (Toy toy: toys) {
            weightSum += toy.getWeight();
            if ((randomWeight <= weightSum) && (toy.getQuantity() > 0)) {
                prizeToys.add(toy);
                toy.setQuantity(toy.getQuantity() - 1);
                return toy;
            }
        }

        return null;
    }
}
