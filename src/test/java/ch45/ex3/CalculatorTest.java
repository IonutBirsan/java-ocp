package ch45.ex3;

import org.example.ch45.ex3.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddIntAndInt() {
        Calculator calc = new Calculator();

        assertEquals(3, calc.add(1, 2));
        assertEquals(-1, calc.add(1, -2));
        assertEquals(0, calc.add(0, 0));
    }

    @Test
    void testAddDoubleAndDouble() {
        Calculator calc = new Calculator();
        assertEquals(4.5, calc.add(2.3, 2.2), 0.0001);
        assertEquals(-1.2, calc.add(1.5, -2.7), 0.0001);
        assertEquals(0.0, calc.add(0.0, 0.0), 0.0001);
    }

    @Test
    void testAddIntAndDouble() {
        Calculator calc = new Calculator();
        assertEquals(12.2, calc.add(2, 10.2), 0.0001);
        assertEquals(-7.8, calc.add(-10, 2.2), 0.0001);
        assertEquals(2.0, calc.add(0, 2.0), 0.0001);
    }
}