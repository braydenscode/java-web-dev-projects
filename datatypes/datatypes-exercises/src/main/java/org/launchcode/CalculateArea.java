package org.launchcode;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of your rectangle? ");
        Integer length = input.nextInt();

        System.out.println("What is the width of your rectangle? ");
        Integer width = input.nextInt();

        System.out.println("The area of the rectangle is: " + (length * width));
        input.close();
    }
}
