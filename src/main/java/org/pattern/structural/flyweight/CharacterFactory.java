package org.pattern.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<java.lang.Character, ConcreteCharacter> characterPool = new HashMap<>();

    public ConcreteCharacter getCharacter(char character, int fontSize, String fontType, Color color) {
        ConcreteCharacter concreteCharacter = characterPool.get(character);
        if (concreteCharacter == null) {
            concreteCharacter = new ConcreteCharacter(character, fontSize, fontType, color);
            characterPool.put(character, concreteCharacter);
        }
        return concreteCharacter;
    }
}
