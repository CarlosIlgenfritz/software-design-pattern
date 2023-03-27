package org.pattern.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();

        smartHome.addLight("Living Room");
        smartHome.addLight("Bed Room");

        smartHome.setTemperature(22);

        smartHome.turnOnLights("Living Room");

        smartHome.turnOffLights("Living Room");
    }
}
