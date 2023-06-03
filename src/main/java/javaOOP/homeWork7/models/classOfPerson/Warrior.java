package javaOOP.homeWork7.models.classOfPerson;

import javaOOP.homeWork7.models.Armor.Armor;
import javaOOP.homeWork7.models.Armor.Shield;
import javaOOP.homeWork7.models.weapon.Sword;

public class Warrior extends ClassOfPerson implements Action {
    protected Sword sword;
    protected Shield shield;
    protected Armor armor;

    public Warrior(int hp, int stm, Sword sword, Shield shield, Armor armor) {
        super(hp, stm, shield.setDefendPoints() + armor.setDefendPoints());
        this.sword = sword;
        this.shield = shield;
        this.armor = armor;
    }

    @Override
    public int attack() {
        return sword.setDamage();
    }

    @Override
    public void getDamage(int damagePoints) {
        if (defendPoints == 0) {
            if (hp > 0) {
                if (hp - damagePoints > 0) {
                    hp -= damagePoints;
                }
                else {
                    hp = 0;
                }
            }
            else {
                hp = 0;
            }
        } else {
            if (defendPoints >= damagePoints) {
                defendPoints -= damagePoints;
            } else if (hp + defendPoints >= damagePoints) {
                damagePoints -= defendPoints;
                hp -= damagePoints;
            }
            else {
                hp = 0;
                defendPoints = 0;
            }
        }
    }
}
