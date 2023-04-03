package org.pattern.behavioral.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> mementos = new Stack<>();
    private TextEditor textEditor;

    public Caretaker(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void save() {
        mementos.push(textEditor.save());
    }

    public void undo() {
        if (!mementos.isEmpty()) {
            Memento memento = mementos.pop();
            textEditor.restore(memento);
        }
    }
}
