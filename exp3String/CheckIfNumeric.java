// Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
package prgm3;

public class CheckIfNumeric {
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "123456";
        System.out.println("Is numeric? " + isNumeric(input));
        // Output confirms input contains only numeric digits (true).
    }
}
