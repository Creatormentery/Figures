package com.figures.figures;

import com.figures.Figures;

public class Circle extends Figures {
    private String name;
    private String type;
    private double r;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getR() {
        return r;
    }

    public Circle(String name, String type, double r) {
        super(name, type);
        this.r = r;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * getR();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getR(), 2);
    }

    @Override
    public void display() {
        System.out.println("Circle");
    }
}
