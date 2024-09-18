package com.keyin.entities;

public class ArrayTableExample {

    public static void main(String[] args) {
        // Create a 2D array (3x3 grid)
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{10, 11, 12}};

        // Print the 2D array in tabular form
        print2DArray(array);
    }

    // Method to print a 2D array in tabular form
    public static void print2DArray(int[][] array) {
        // Loop through the rows of the array
        for (int i = 0; i < array.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < array[i].length; j++) {
                // Print each element with a tab for spacing
                System.out.print(array[i][j] + "\t");
            }
            // Move to the next line after printing the row
            System.out.println();
        }
    }
}
