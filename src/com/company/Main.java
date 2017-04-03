package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // initialize object

        // output prompt
        System.out.println("Enter a line of text: ");

        // wait for user to enter double
        Double value = input.nextDouble();

        System.out.println("You inputted " + value);

    }
}
