package org.example.ch13.ex2;

public class GridScanner {

    public static void main(String[] args) {

        char[][] grid = {
                {'.', '.', '#', '.'},
                {'a', '#', 'b', '2'},
                {'.', '.', '.', '.'}
        };

        String result = scanGrid(grid);
        System.out.println(result);
    }

    public static String scanGrid(char[][] grid) {

        String result = "none";

        outer:
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                char c = grid[i][j];

                if (Character.isDigit(c)) {
                    result = "Digit " + c + " found at position " + (i + 1) + "," + (j + 1);
                    break outer;
                }
                if (c == '#') {
                    continue;
                }
            }
        }

        return result;
    }
}
