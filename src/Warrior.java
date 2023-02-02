// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
package Seminar4;

import Seminar4.Shields.ShieldBearing;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;

    private ShieldBearing shield;

    public Warrior(String name, int healthPoint, Weaponable weapon, ShieldBearing shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weaponable getWeapon() {
        return weapon;
    }

    public ShieldBearing getShield() {
        return shield;
    }


    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warrior [Имя: " + name + ", Здоровье: " + healthPoint + ", Оружие: " + weapon + ", Щит: " + shield + "]";
    }
}
