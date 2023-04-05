package org.pattern.structural.bridge;

import org.pattern.structural.bridge.devices.Device;
import org.pattern.structural.bridge.devices.Radio;
import org.pattern.structural.bridge.devices.Tv;
import org.pattern.structural.bridge.remote.AdvancedRemote;
import org.pattern.structural.bridge.remote.BasicRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
