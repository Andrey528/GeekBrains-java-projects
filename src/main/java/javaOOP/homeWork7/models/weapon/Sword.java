package javaOOP.homeWork7.models.weapon;

public class Sword implements Damage {
    @Override
    public int setDamage() {
        return (int) Math.random() * 20;
    }
}
