package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        switch(text) {
            case "start": // case must be a constant, can't perform checks using blocks containing conditionals
                System.out.println("Machine started!");
                break;
            case "stop":
                System.out.println("Stopped.");
                break;

            default:
                System.out.println("Not recognized");

        }
    }
}
