package com.figures.quadrangl;

import com.figures.Figures;

public class Quadrate extends Figures {
    private String name;
    private String type;
    private double a;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getA() {
        return a;
    }

    @Override
    public double getPerimetr() {
        return getA() * 4;
    }

    @Override
    public double getArea() {
        return getA() * getA();
    }

    @Override
    public void display() {
        System.out.println("Quadrate");
    }
}
