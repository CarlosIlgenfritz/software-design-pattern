package org.pattern.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel Core", "i9-11900K", 150.0);
        HardDrive hardDrive = new HardDrive("Samsung", "Evo", 280.0);
        Ram ram = new Ram("Corsair", "Vengeance RGB Pro", 20.0);

        PowerConsumptionVisitor powerVisitor = new PowerConsumptionVisitor();
        cpu.accept(powerVisitor);
        hardDrive.accept(powerVisitor);
        ram.accept(powerVisitor);

        double totalPowerConsumption = powerVisitor.getTotalPowerConsumption();
        System.out.println("Total power consumption: " + totalPowerConsumption + " watts");
    }
}
