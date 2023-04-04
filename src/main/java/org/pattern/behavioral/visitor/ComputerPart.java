package org.pattern.behavioral.visitor;

//element
public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
