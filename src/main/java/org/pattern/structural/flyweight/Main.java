package org.pattern.structural.flyweight;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        ConcreteCharacter c1 = characterFactory.getCharacter('A', 12, "Arial", Color.BLACK);
        c1.display();

        ConcreteCharacter c2 = characterFactory.getCharacter('A', 12, "Arial", Color.BLUE);
        c2.display();

        ConcreteCharacter c3 = characterFactory.getCharacter('B', 10, "Times New Roman", Color.RED);
        c3.display();
    }
}
