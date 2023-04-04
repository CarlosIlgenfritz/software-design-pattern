package org.pattern.behavioral.visitor;

public interface ComputerPartVisitor {
    void visit(Cpu cpu);
    void visit(Ram ram);
    void visit(HardDrive hardDrive);
}
