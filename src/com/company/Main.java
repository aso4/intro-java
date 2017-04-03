package com.company;

public class Main {

    public static void main(String[] args) {
        double myDouble = 7.8; // double precision floating point number

        int value = 0;

        while(value < 10)
        {
            value = value + 1;
        }

        for(int i=0; i < 5; i = i + 1) {
            System.out.printf("The value of i is: %d\n", i); // printf = format specifier.
            // printf doesn't print new line with it.
            // output: The value of i is: 0The value of i is: 1The value of i is: 2The value of i is: 3The value of i is: 4
            // therefore add \n
        }
    }
}
