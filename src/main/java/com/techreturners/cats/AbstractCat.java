package com.techreturners.cats;

public abstract class AbstractCat implements Cat {
    int height;
    boolean asleep = false;
    String setting;
    String eatingResponse;

    public AbstractCat(int height, String setting, String eatingResponse) {
        this.height = height;
        this.setting = setting;
        this.eatingResponse = eatingResponse;
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

    public String eat() {
        return eatingResponse;
    }
}
