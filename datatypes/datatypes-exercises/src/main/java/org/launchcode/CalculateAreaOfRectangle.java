package org.launchcode;

import java.util.Scanner;

public class CalculateAreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        double width = input.nextDouble();
        input.close();
        double area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
