package org.pattern.creational.prototype;

public class Goblin implements Enemy {
    private int health;
    private int attackPower;
    private int defense;

    public Goblin() {
        this.health = 100;
        this.attackPower = 10;
        this.defense = 5;
    }

    public Goblin(Goblin goblin) {
        this.health = goblin.health;
        this.attackPower = goblin.attackPower;
        this.defense = goblin.defense;
    }

    public void attack() {
        System.out.println("Goblin attacks with " + attackPower + " attack power");
    }

    public Enemy clone() {
        return new Goblin(this);
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
