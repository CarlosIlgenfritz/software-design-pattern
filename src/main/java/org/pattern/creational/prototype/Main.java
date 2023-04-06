package org.pattern.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Goblin goblin = new Goblin();
        Goblin clonedGoblin = (Goblin)goblin.clone();

        clonedGoblin.setHealth(50);

        goblin.attack();
        clonedGoblin.attack();
    }
}
