package org.pattern.behavioral.memento;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.getText();
    }

    public String getText() {
        return text;
    }
}
