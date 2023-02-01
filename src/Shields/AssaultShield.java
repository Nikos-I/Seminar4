package Seminar4.Shields;

import java.util.Random;

public class AssaultShield extends Shield{
    int pointOfDamage;

    public AssaultShield(int pointOfDefence) {
        super(pointOfDefence);
    }

    @Override
    public String toString() {
        return String.format("Щит: защита = %d, урон = %d", pointOfDefence, pointOfDamage);
    }

    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }
}
