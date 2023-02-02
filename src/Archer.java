package Seminar4;

import Seminar4.Shields.DefensiveShield;
import Seminar4.Weapons.Bow;

public class Archer extends Warrior {

    public Archer(String name, int healthPoint, Bow bow, DefensiveShield shield) {
        super(name, healthPoint, bow, shield);
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon()).getRange();
    }
    
}
