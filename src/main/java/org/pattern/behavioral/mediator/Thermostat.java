package org.pattern.behavioral.mediator;

public class Thermostat {
    private int temperature;

    public Thermostat() {
        this.temperature = 70;
    }

    public void setTemperature(int temperature) {
        System.out.println("Setting temperature to " + temperature + " degrees");
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
