package javaOOP.homeWork7.models.Armor;

public class Armor extends Defend implements SetDefendPoints {
    public Armor(int defendPoints) {
        super(defendPoints);
    }

    @Override
    public int setDefendPoints() {
        return (int) Math.random() * 20;
    }
}
