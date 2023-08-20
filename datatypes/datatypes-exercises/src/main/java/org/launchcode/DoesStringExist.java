package org.launchcode;

import java.util.Scanner;

public class DoesStringExist {
    public static void main(String[] args) {
        String aliceQuote = "Alice was beginning to get very tired of sitting" +
                " by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use" +
                " of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search: ");
        String searchFor = input.nextLine().toLowerCase();
        if (aliceQuote.toLowerCase().contains(searchFor)) {
            Integer indexOf = aliceQuote.indexOf(aliceQuote);
            Integer length = searchFor.length();
            System.out.println("Search term found at index " + indexOf + " with a length of " + length + " characters");
            String modifiedSentence = aliceQuote.replace(searchFor, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("Search term not found, try again.");
        }
        input.close();
    }
}
