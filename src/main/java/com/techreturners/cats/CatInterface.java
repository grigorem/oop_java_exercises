package com.techreturners.cats;

public abstract class CatInterface implements Cat {
    int height;
    boolean asleep;
    String setting;

    public CatInterface() {
        asleep = false;
    }

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
