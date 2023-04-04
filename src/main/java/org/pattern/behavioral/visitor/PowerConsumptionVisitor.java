package org.pattern.behavioral.visitor;

public class PowerConsumptionVisitor implements ComputerPartVisitor {
    private double totalPowerConsumption;

    @Override
    public void visit(Cpu cpu) {
        totalPowerConsumption += cpu.getPowerConsumption();
    }

    @Override
    public void visit(HardDrive hardDrive) {
        totalPowerConsumption += hardDrive.getPowerConsumption();
    }

    @Override
    public void visit(Ram ram) {
        totalPowerConsumption += ram.getPowerConsumption();
    }

    public double getTotalPowerConsumption() {
        return totalPowerConsumption;
    }
}
