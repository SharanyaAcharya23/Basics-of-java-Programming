// Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
package prgm3;

public class TruncateString3c7 {
    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String input = "Artificial Intelligence and Data Science";
        System.out.println("Input:"+input);
        System.out.println("Truncated: " + truncate(input, 20));
        // Output shortens string to 20 chars and adds "..." at the end.
    }
}
