package com.figures.figures;

import com.figures.Figures;

public class Hexagon extends Figures {
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

    public Hexagon(String name, String type, double a) {
        super(name, type);
        this.a = a;
    }

    @Override
    public double getPerimetr() {
        return getA() * 6;
    }

    @Override
    public double getArea() {
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(getA(), 2);
    }

    @Override
    public void display() {
        System.out.println("Hexagon");
    }
}
