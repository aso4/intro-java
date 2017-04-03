package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[][] grid = { // array
//                {3, 5, 2343}, // row 1
//                {2, 4}, // row 2
//                {1, 2, 3, 4} // row 3
//        };

//        System.out.println(grid[1][1]); // 4
//        System.out.println(grid[0][2]); // 2343

//        for(int row=0; row< grid.length; row++) {
//            for(int col=0; col < grid[row].length; col++) {
//                System.out.print(grid[row][col] + "\t");
//            }
//            System.out.println();
//        }

        String[][] words = new String[2][3]; // two row matrix, values are null

        for(int x=0;x<words.length;x++) {
            Arrays.fill(words[x], "word");
        }

//        for(int x=0;x<words.length;x++) {
//            for (int y = 0; y < words[x].length; y++)
//                words[x][y] = "word";
//        }

        for (int row = 0; row < words.length; row++) {
            for (int col = 0; col < words[row].length; col++) {
                System.out.print(words[row][col] + "\t");
            }
            System.out.println();
        }

    }
}
