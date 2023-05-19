package com.figures.triangles;
import com.figures.Figures;

class Triangle extends Figures {
    private String name;
    private String type;
    private int a;
    private int b;
    private int c;
    private int r;
    private int h;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getR() {
        return r;
    }

    public int getH() {
        return h;
    }

    public Triangle(String name, String type, int a, int b, int c, int r, int h) {
        super(name, type);
        this.a = a;
        this.b = b;
        this.c = c;
        this.r = r;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (getA() * getH()) / 2;
    }

    @Override
    public double getPerimetr() {
        return (getA() * getB() * getC()) / 4 * getR();
    }

    @Override
    public void display() {
        System.out.println("Basic triangle");
    }
}
