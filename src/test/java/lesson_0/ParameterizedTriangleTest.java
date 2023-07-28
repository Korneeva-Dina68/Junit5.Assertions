package lesson_0;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParameterizedTriangleTest {

    public static Stream<Arguments> triangles() {
        return Stream.of(Arguments.of(new Triangle(3, 4, 5), 12),
                Arguments.of(new Triangle(3, 4, 6), 13),
                Arguments.of(new Triangle(3, 3, 3), 9));
    }

    @ParameterizedTest(name="Периметр треугольника {0} должен быть равен {1}")
    @MethodSource("triangles")
    @DisplayName("Периметр треугольника: позитивный сценарий")
    public void countPerimeterTriangleTest(Triangle triangle, int expectedPerimeter) {
        int perimeter = triangle.countPerimeter();//Act
        assertEquals(expectedPerimeter, perimeter);
    }
    public static Stream<Arguments> invalidTriangles() {
        return Stream.of(Arguments.of(new Triangle(3, 3, 6), "Triangle is invalid: one side greater than sum of another sides"),
                Arguments.of(new Triangle(6, 3, 3), "Triangle is invalid: one side greater than sum of another sides"),
                Arguments.of(new Triangle(3, 6, 3), "Triangle is invalid: one side greater than sum of another sides"),
                Arguments.of(new Triangle(9, 3, 3), "Triangle is invalid: one side greater than sum of another sides"),
                Arguments.of(new Triangle(-3, 3, 3), "Triangle is invalid: sides must be positive"),
                Arguments.of(new Triangle(3, -3, 3), "Triangle is invalid: sides must be positive"),
                Arguments.of(new Triangle(3, 3, -3), "Triangle is invalid: sides must be positive"),
                Arguments.of(new Triangle(3, 3, 0), "Triangle is invalid: sides must be positive"),
                Arguments.of(new Triangle(3, 0, 3), "Triangle is invalid: sides must be positive"),
                Arguments.of(new Triangle(0, 3, 3), "Triangle is invalid: sides must be positive"));
    }
    @ParameterizedTest(name="Периметр треугольника {0} должен быть равен {1}")
    @MethodSource("invalidTriangles")
    @DisplayName("Периметр треугольника: негативный сценарий")
    public void countPerimeterInvalidTriangleErrorTest(Triangle triangle, String errorText) {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, triangle::countPerimeter);
        assertEquals(errorText, illegalArgumentException.getMessage());
    }
}