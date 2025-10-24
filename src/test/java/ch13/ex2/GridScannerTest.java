package ch13.ex2;

import org.example.ch13.ex2.GridScanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GridScannerTest {


    @Test
    void happyFlow(){

        char[][] grid = {
                {'.', '.', '#', '.'},
                {'a', '#', 'b', '2'},
                {'.', '.', '.', '.'}
        };

        String result = GridScanner.scanGrid(grid);
        assertEquals("Digit 2 found at position 2,4", result);
    }

    @Test
    void sadFlow(){

        char[][] grid = {
                {'.', '.', '#', '.'},
                {'a', '#', 'b', '$'},
                {'.', '.', '.', '.'}
        };

        String result = GridScanner.scanGrid(grid);
        assertEquals("none", result);
    }

    @Test
    void firstDigit(){

        char[][] grid = {
                {'.', '5', '#', '.'},
                {'a', '#', 'b', '2'},
                {'.', '7', '.', '.'}
        };

        String result = GridScanner.scanGrid(grid);
        assertEquals("Digit 5 found at position 1,2", result);
    }

}
