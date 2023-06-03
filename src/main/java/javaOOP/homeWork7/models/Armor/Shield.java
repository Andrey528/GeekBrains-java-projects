package javaOOP.homeWork7.models.Armor;

public class Shield extends Defend implements SetDefendPoints {
    public Shield(int defendPoints) {
        super(defendPoints);
    }

    @Override
    public int setDefendPoints() {
        return (int) Math.random() * 10;
    }
}
