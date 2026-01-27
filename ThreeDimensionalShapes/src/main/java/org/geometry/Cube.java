package org.geometry;

public class Cube implements ThreeDimensionalShape {
    private final double sideLength;
    private final String name;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
        this.name = "Cube";
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSideLength() {
        return sideLength;
    }
}
