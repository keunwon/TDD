package com.java.tdd.main;

public class Dallar {
    private int ammount;

    public Dallar(int ammount) {
        this.ammount = ammount;
    }

    public void times(int multiplier) {
        ammount *= multiplier;
    }
}