package org.geometry;

import java.util.Comparator;
import java.util.List;

public class GeometryUtils {

    // Конвертация квадратных метров в квадратные сантиметры
    public static double convertSquareMetersToCm2(double squareMeters) {
        return squareMeters * 10000;
    }

    // Конвертация квадратных сантиметров в квадратные метры
    public static double convertSquareCmToM2(double squareCm) {
        return squareCm / 10000;
    }

    // Сравнение фигур по площади
    public static int compareByArea(Shape shape1, Shape shape2) {
        return Double.compare(shape1.calculateArea(), shape2.calculateArea());
    }

    // Сортировка фигур по площади
    public static void sortByArea(List<Shape> shapes) {
        shapes.sort(Comparator.comparingDouble(Shape::calculateArea));
    }

    // Сортировка фигур по периметру
    public static void sortByPerimeter(List<Shape> shapes) {
        shapes.sort(Comparator.comparingDouble(Shape::calculatePerimeter));
    }

    //  Добавлен в версиии 1.1.0-SNAPSHOT
    // Нахождение фигуры с максимальной площадью
    public static Shape findLargestByArea(List<Shape> shapes) {
        return shapes.stream()
                .max(Comparator.comparingDouble(Shape::calculateArea))
                .orElse(null);
    }

    //  Добавлен в версиии 1.1.0-SNAPSHOT
    // Нахождение фигуры с минимальной площадью
    public static Shape findSmallestByArea(List<Shape> shapes) {
        return shapes.stream()
                .min(Comparator.comparingDouble(Shape::calculateArea))
                .orElse(null);
    }
}
