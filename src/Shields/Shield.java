package Seminar4.Shields;

import java.util.Random;

public abstract class Shield {
    protected int pointOfDefence;

    public Shield(int pointOfDefence) {
        this.pointOfDefence = pointOfDefence;
    }

    public String toString() {
        return String.format("Щит: защита = %d", pointOfDefence);
    }

    public int defence() {
        return new Random().nextInt(0, pointOfDefence);
    }

}
