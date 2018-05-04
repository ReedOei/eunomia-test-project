package com.reedoei.eunomia.test.project;

public class Circle {
    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius*radius*Math.PI;
    }
}
