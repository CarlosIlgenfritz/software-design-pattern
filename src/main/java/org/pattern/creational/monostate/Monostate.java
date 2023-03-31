package org.pattern.creational.monostate;

public class Monostate {

    private static int sharedState = 0;

    public int getSharedState() {
        return sharedState;
    }

    public void setSharedState(int sharedState) {
        Monostate.sharedState = sharedState;
    }
}
