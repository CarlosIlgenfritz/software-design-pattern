package org.pattern.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker(textEditor);

        textEditor.setText("Hello, world!");
        caretaker.save();

        textEditor.setText("Goodbye, world!");
        caretaker.save();

        caretaker.undo();
        System.out.println(textEditor.getText());
    }
}
