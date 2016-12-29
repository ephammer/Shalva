package com.shalva.shalva;

import java.util.ArrayList;

/**
 * Created by kid0n on 29/12/2016.
 */

public class Teacher {

    private ArrayList<Child> children;
    private String name;
    private boolean present;

    public Teacher(String name, ArrayList<Child> children) {
        this.name = name;

        this.children = children;

        this.present = true;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Child> getChildren() {
        return children;
    }

    public boolean isPresent() {
        return present;
    }

    public void absent() {
        this.present = false;
    }

    public void present() {
        this.present = true;
    }
}
