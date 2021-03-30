package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends AbstractCat {

    public DomesticCat() {
        super(23, "domestic", "Purrrrrrr");
    }

    @Override
    public String eat() {
        Random rand = new Random();

        if (rand.nextInt(10) >= 8) {
            return "It will do I suppose";
        }

        return eatingResponse;
    }
}
