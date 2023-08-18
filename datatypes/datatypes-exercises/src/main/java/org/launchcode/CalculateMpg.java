package org.launchcode;

import java.util.Scanner;

public class CalculateMpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the capacity of your gas tank: ");
        double capacity = input.nextDouble();
        System.out.println("Please enter total miles traveled: ");
        double totalMiles = input.nextDouble();
        double mpg = totalMiles / capacity;
        System.out.println("Your mpg is " + mpg);
    }
}
