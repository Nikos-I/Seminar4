package Seminar4;

import Seminar4.Shields.AssaultShield;
import Seminar4.Weapons.Sword;

public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Sword sword, AssaultShield shield) {
        super(name, healthPoint, sword, shield);
    }

    @Override
    public String toString() {
        return "Swordman, " + super.toString();
    }
    
}
