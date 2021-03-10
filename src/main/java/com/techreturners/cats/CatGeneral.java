package com.techreturners.cats;

public abstract class CatGeneral implements Cat {
    int height;
    boolean asleep = false;
    String setting;

    public void goToSleep() {
        asleep = true;
    }

    public boolean isAsleep() {
        return asleep;
    }

    public void wakeUp() {
        asleep = false;
    }

    public String getSetting() {
        return setting;
    }

    public int getAverageHeight() {
        return height;
    }
}
