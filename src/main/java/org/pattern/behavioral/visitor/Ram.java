package org.pattern.behavioral.visitor;

public class Ram implements ComputerPart {
    private String brand;
    private String model;
    private double powerConsumption;

    public Ram(String brand, String model, double powerConsumption) {
        this.brand = brand;
        this.model = model;
        this.powerConsumption = powerConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
