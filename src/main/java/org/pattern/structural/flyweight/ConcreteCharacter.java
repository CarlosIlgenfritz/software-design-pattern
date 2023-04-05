package org.pattern.structural.flyweight;

import java.awt.*;

public class ConcreteCharacter implements Character {
    private char character;
    private int fontSize;
    private String fontType;
    private Color color;

    public ConcreteCharacter(char character, int fontSize, String fontType, Color color) {
        this.character = character;
        this.fontSize = fontSize;
        this.fontType = fontType;
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Character: " + character + " Font size: " + fontSize + " Font type: " + fontType + " Color: " + color);
    }
}
