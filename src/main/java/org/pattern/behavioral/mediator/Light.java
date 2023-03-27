package org.pattern.behavioral.mediator;

public class Light {
    private String room;
    private boolean isOn;

    public Light(String room) {
        this.room = room;
        this.isOn = false;
    }

    public void turnOn() {
        System.out.println("Turning on light in " + room);
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Turning off light in " + room);
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
