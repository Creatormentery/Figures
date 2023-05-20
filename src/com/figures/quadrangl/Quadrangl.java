package com.figures.quadrangl;

import com.figures.Figures;

public class Quadrangl extends Figures {
    private String name;
    private String type;
    private double d1;
    private double d2;
    private double sin;
    private double a;
    private double b;
    private double c;
    private double d;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }

    public double getSin() {
        return sin;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public Quadrangl(String name, String type, double d1, double d2, double sin, double a, double b, double c, double d) {
        super(name, type);
        this.d1 = d1;
        this.d2 = d2;
        this.sin = sin;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimetr() {
        return getA() + getB() + getC() + getD();
    }

    @Override
    public double getArea() {
        return 0.5 * getD1() * getD2() * getSin();
    }

    @Override
    public void display() {
        System.out.println("Quadrangl");
    }
}
