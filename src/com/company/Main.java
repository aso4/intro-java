package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int value = 7;

        int[] values;

        values = new int[3]; // allocates memory to hold 3 integers
        values[0] = 10;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for(int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {5, 6, 7}; // specify the values at initialization

        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
