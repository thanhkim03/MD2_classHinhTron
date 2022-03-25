package com.company;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area(){
        return PI*this.radius*this.radius;
    }
    public double perimeter(){
        return 2*PI*this.radius;
    }
}
