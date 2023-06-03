package javaOOP.homeWork7.models.classOfPerson;

import javaOOP.homeWork7.models.Armor.Armor;
import javaOOP.homeWork7.models.weapon.Bow;

public class Archer extends ClassOfPerson implements Action {
    protected Bow bow;
    protected Armor armor;

    public Archer(int hp, int stm, Bow bow, Armor armor) {
        super(hp, stm, armor.setDefendPoints());
        this.bow = bow;
        this.armor = armor;
    }

    @Override
    public int attack() {
        return bow.setDamage();
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
