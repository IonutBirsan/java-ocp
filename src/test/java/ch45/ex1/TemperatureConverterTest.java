package ch45.ex1;

import org.example.ch45.ex1.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void testToFahrenheit() {
        assertEquals(32, TemperatureConverter.toFahrenheit(0), 0.01);
        assertEquals(212, TemperatureConverter.toFahrenheit(100), 0.01);
        assertEquals(-40, TemperatureConverter.toFahrenheit(-40), 0.01);
    }

    @Test
    void testToCelsius() {
        assertEquals(0, TemperatureConverter.toCelsius(32), 0.01);
        assertEquals(100, TemperatureConverter.toCelsius(212), 0.01);
        assertEquals(-40, TemperatureConverter.toCelsius(-40), 0.01);
    }
}