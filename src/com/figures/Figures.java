package com.figures;

public abstract class Figures {
    String name;
    String type;

    public Figures(String name, String type) {
        this.name = name;
        this.type = type;
    }


    public abstract double getArea();
    public abstract double getPerimetr();
    public abstract void display();

}
