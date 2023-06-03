package javaOOP.homeWork7.models.weapon;

public class Bow implements Damage {
    @Override
    public int setDamage() {
        return (int) Math.random() * 10;
    }
}
