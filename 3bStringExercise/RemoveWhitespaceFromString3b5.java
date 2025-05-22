//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user definedfunction removeWhitespace()
package prgm3;

public class RemoveWhitespaceFromString3b5 {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String input = " Java    Programming \t is  Fun ";
        System.out.println("Original: '" + input + "'");
        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
    }
}
