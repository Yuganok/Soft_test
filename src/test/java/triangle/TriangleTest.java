package triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void testEquilateral() {
        assertEquals("Equilateral", Triangle.classifyTriangle(100, 100, 100));
    }

    @Test
    void testIsosceles() {
        assertEquals("Isosceles", Triangle.classifyTriangle(100, 100, 50));
        assertEquals("Isosceles", Triangle.classifyTriangle(50, 100, 100));
        assertEquals("Isosceles", Triangle.classifyTriangle(100, 50, 100));
    }

    @Test
    void testScalene() {
        assertEquals("Scalene", Triangle.classifyTriangle(50, 60, 70));
    }

    @Test
    void testNotATriangle() {
        assertEquals("NotATriangle", Triangle.classifyTriangle(100, 50, 30));
        assertEquals("NotATriangle", Triangle.classifyTriangle(1, 2, 3));
    }

    @Test
    void testOutOfRange() {
        assertEquals("Value of a is not in the range of permitted values.", Triangle.classifyTriangle(201, 100, 100));
        assertEquals("Value of b is not in the range of permitted values.", Triangle.classifyTriangle(100, 0, 100));
        assertEquals("Value of c is not in the range of permitted values.", Triangle.classifyTriangle(100, 100, 202));
    }
    @Test
    public void testLowerBoundaryValues() {
        assertEquals("Value of a is not in the range of permitted values.", Triangle.classifyTriangle(0, 10, 10));
        assertEquals("Value of b is not in the range of permitted values.", Triangle.classifyTriangle(10, 0, 10));
        assertEquals("Value of c is not in the range of permitted values.", Triangle.classifyTriangle(10, 10, 0));
    }

    @Test
    public void testUpperBoundaryValues() {
        assertEquals("Value of a is not in the range of permitted values.", Triangle.classifyTriangle(201, 10, 10));
        assertEquals("Value of b is not in the range of permitted values.", Triangle.classifyTriangle(10, 201, 10));
        assertEquals("Value of c is not in the range of permitted values.", Triangle.classifyTriangle(10, 10, 201));
    }
}
