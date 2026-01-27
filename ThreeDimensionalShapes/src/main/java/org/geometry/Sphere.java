package org.geometry;

public class Sphere implements ThreeDimensionalShape {
    private final double radius;
    private final String name;

    public Sphere(double radius) {
        this.radius = radius;
        this.name = "Sphere";
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }
}