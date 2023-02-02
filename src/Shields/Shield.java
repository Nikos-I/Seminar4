package Seminar4.Shields;

import java.util.Random;

public abstract class Shield implements ShieldBearing{
    protected int pointOfDefence;
    protected String nameShield;

    public Shield(int pointOfDefence, String nameShield) {
        this.nameShield = nameShield;
        this.pointOfDefence = pointOfDefence;
    }

    public String toString() {
        return String.format("%s, защита = %d", nameShield, pointOfDefence);
    }

    public int defence() {
        return new Random().nextInt(0, pointOfDefence);
    }
    public int getPointOfDefence() {
        return pointOfDefence;
    }


}
