//Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using userdefined function isNullOrEmpty().
package prgm3;
public class CheckIfStringIsNullOrWhitespace {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String input = "   ";
        System.out.println("Input: '" + input + "'");
        System.out.println("Is null or only whitespace? " + isNullOrEmpty(input));
    }
}
