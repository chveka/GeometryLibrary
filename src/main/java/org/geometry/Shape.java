package org.geometry;

public interface Shape {
    double calculateArea();
    double calculatePerimeter();
    String getName();

    // Добавил метод для версии 1.1.0
    default String getDescription() {
        return "This is a " + getName();
    }
}