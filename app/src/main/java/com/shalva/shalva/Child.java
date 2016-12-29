package com.shalva.shalva;

/**
 * Created by kid0n on 29/12/2016.
 */

public class Child {

    private String name;
    private Hood hood;
    private boolean present;

    public Child(String name, Hood hood) {
        this.name = name;

        this.hood = hood;

        this.present = true;
    }

    public Hood getHood() {
        return hood;
    }

    public String getName() {
        return name;
    }

    public boolean isPresent() {
        return present;
    }

    public void absent() {
        this.present = false;
    }
}
