package org.pattern.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class SmartHome implements SmartHomeMediator {
    private Map<String, Light> lights;
    private Thermostat thermostat;

    public SmartHome() {
        this.lights = new HashMap<>();
        this.thermostat = new Thermostat();
    }

    @Override
    public void turnOnLights(String room) {
        Light light = lights.get(room);
        if (light != null && !light.isOn()) {
            light.turnOn();
        }
    }

    @Override
    public void turnOffLights(String room) {
        Light light = lights.get(room);
        if (light != null && light.isOn()) {
            light.turnOff();
        }
    }

    @Override
    public void setTemperature(int temperature) {
        thermostat.setTemperature(temperature);
    }

    public void addLight(String room) {
        lights.put(room, new Light(room));
    }
}
