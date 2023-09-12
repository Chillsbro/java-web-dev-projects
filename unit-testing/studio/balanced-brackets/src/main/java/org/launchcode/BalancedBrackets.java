package org.launchcode;

public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        char[] input = str.toCharArray();
        for (char ch : input) {
            if (ch == '[') {
                brackets++; // opening bracket increments brackets by 1
            } else if (ch == ']') {
                if (brackets == 0) { // if bracket is 0 when ']' is seen, that means we haven't seen an opening, therefore false..
                    return false;
                }
                brackets--;
            }
        }
        return brackets == 0;
    }
}