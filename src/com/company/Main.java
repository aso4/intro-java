package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // initialize object

        // output prompt
        System.out.println("Enter a line of text: ");

        // wait for user to enter line of text
        String line = input.nextLine();

        System.out.println("You inputted " + line);

    }
}
