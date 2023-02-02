package Seminar4.Shields;

import java.util.Random;

public class AssaultShield extends Shield{
    int pointOfDamage;
    protected String nameShield;

    public AssaultShield(int pointOfDefence) {
        super(pointOfDefence, "Штурмовой");
    }

    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }
}
