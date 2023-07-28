package lesson_0;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {
    @Test
    @DisplayName("Периметр египетского треугольника")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterEgyptTriangleTest() {
        Triangle triangle = new Triangle(3, 4, 5);
        int perimeter = triangle.countPerimeter();
        assertEquals(12, perimeter);
    }
    @Test
    @DisplayName("Периметр тупоугольного треугольника")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterTriangleWithAngleGreaterThan90SuccesfullTest() {
        Triangle triangle = new Triangle(3, 4, 6);
        int perimeter = triangle.countPerimeter();
        assertEquals(13, perimeter);
    }
    @Test
    @DisplayName("Периметр правильного треугольника")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterRightTriangleSuccesfullTest() {
        Triangle triangle = new Triangle(3, 4, 5);
        int perimeter = triangle.countPerimeter();
        assertEquals(12, perimeter);
    }
    @Test
    @DisplayName("Периметр невалидного треугольника со стороной большей, чем сумма двух других сторон")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterInvalidTriangleWithSideEqualSumOfOtherTest() {
        Triangle triangle = new Triangle(3, 3, 6);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, triangle::countPerimeter);
        assertEquals("Triangle is invalid: one side greater than sum of another sides", illegalArgumentException.getMessage());
    }
    @Test
    @DisplayName("Периметр невалидного треугольника со стороной большей, чем сумма двух других сторон")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterInvalidTriangleWithSideGreaterSumOfOtherTest() {
        Triangle triangle = new Triangle(3, 3, 9);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, triangle::countPerimeter);
        assertEquals("Triangle is invalid: one side greater than sum of another sides", illegalArgumentException.getMessage());
    }
    @Test
    @DisplayName("Периметр невалидного треугольника: отрицательная сторона")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterInvalidTriangleWithNegativeASideTest() {
        Triangle triangle = new Triangle(-3, 3, 3);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, triangle::countPerimeter);
        assertEquals("Triangle is invalid: sides must be positive", illegalArgumentException.getMessage());
    }
    @Test
    @DisplayName("Периметр невалидного треугольника: отрицательная сторона")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterInvalidTriangleWithNegativeBSideTest() {
        Triangle triangle = new Triangle(3, -3, 3);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, triangle::countPerimeter);
        assertEquals("Triangle is invalid: sides must be positive", illegalArgumentException.getMessage());
    }
    @Test
    @DisplayName("Периметр невалидного треугольника: отрицательная сторона")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterInvalidTriangleWithNegativeCSideTest() {
        Triangle triangle = new Triangle(3, 3, -3);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, triangle::countPerimeter);
        assertEquals("Triangle is invalid: sides must be positive", illegalArgumentException.getMessage());
    }

    @Test
    @DisplayName("Периметр невалидного треугольника: нулевая сторона")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterInvalidTriangleWithZeroASideTest() {
        Triangle triangle = new Triangle(0, 3, 3);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, triangle::countPerimeter);
        assertEquals("Triangle is invalid: sides must be positive", illegalArgumentException.getMessage());
    }
    @Test
    @DisplayName("Периметр невалидного треугольника: нулевая сторона")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterInvalidTriangleWithZeroBSideTest() {
        Triangle triangle = new Triangle(3, 0, 3);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, triangle::countPerimeter);
        assertEquals("Triangle is invalid: sides must be positive", illegalArgumentException.getMessage());
    }
    @Test
    @DisplayName("Периметр невалидного треугольника: нулевая сторона")
    @Disabled("Перенесены в параметризованный тест")
    public void countPerimeterInvalidTriangleWithZeroCSideTest() {
        Triangle triangle = new Triangle(3, 3, 0);
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, triangle::countPerimeter);
        assertEquals("Triangle is invalid: sides must be positive", illegalArgumentException.getMessage());
    }
}