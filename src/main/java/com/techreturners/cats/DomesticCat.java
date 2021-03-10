package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CatInterface {

    public DomesticCat() {
        super();

        height = 23;
        setting = "domestic";
    }

    public String eat() {
        Random rand = new Random();

        if (rand.nextInt(10) >= 8) {
            return "It will do I suppose";
        }

        return "Purrrrrrr";
    }

    public void run() {

    }
}
