package com.figures.figures;

import com.figures.Figures;

public class Oval extends Figures {
    private String name;
    private String type;
    private double a;
    private double b;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Oval(String name, String type, double a, double b) {
        super(name, type);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetr() {
        return 4 * ((Math.PI * getA() * getB() + (getA() - getB())) / getA() + getB());
    }

    @Override
    public double getArea() {
        return Math.PI * getA() * getB();
    }

    @Override
    public void display() {
        System.out.println("Oval");
    }
}
