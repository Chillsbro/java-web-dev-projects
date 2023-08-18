package org.launchcode;

import java.util.Scanner;
import java.lang.StringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in a word to see the reverse!: ");
        String word = input.nextLine();
        StringBuilder newWord = new StringBuilder(word);
        System.out.println(newWord.reverse());
    }
}
