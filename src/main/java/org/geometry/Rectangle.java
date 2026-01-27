package org.geometry;

public class Rectangle implements Shape {
    private final double width;
    private final double height;
    private final String name;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.name = "Rectangle";
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}