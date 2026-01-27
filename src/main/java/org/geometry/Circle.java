package org.geometry;

public class Circle implements Shape {
    private final double radius;
    private final String name;

    public Circle(double radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }
}