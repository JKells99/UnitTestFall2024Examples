package com.keyin.entities;

import java.util.Arrays;

public class ArrayTableExample {

    public static void main(String[] args) {
        // Create a 2D array (3x3 grid)
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{10, 11, 12}};
        int[] array1 = {1, 2, 3};
        // This is how to print array with built-in java method
        System.out.println(Arrays.toString(array1));

        // This is how to print 2d array with built-in java method
        System.out.println(Arrays.deepToString(array));

        // Access Specific Position In 2D Arary
        System.out.println(array[1][2]);


        // Print the 2D array in tabular form this is custom method
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
