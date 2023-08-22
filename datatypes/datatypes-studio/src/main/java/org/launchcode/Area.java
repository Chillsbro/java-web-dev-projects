package org.launchcode;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");
        double radius = input.nextDouble();


        while (radius < 0 || radius > 9) {
            System.out.println("Please enter a positive number for the radius of your circle: ");
            radius = input.nextDouble();
        }

        System.out.println("The area of a circle with radius " + radius + "is " + Circle.getArea(radius));
        input.close();
    }

}
