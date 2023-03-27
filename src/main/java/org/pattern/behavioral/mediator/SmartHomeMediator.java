package org.pattern.behavioral.mediator;

public interface SmartHomeMediator {
    void turnOnLights(String room);
    void turnOffLights(String roomg);
    void setTemperature(int temperature);
}
