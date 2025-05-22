// Q6. Write a Java Program for Capitalizing the first letter of each word using user defined function capitalizeWords()
package prgm3;

public class CapitalizeWords3c6 {
    public static String capitalizeWords(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1)).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "java programming language";
        System.out.println("Capitalized: " + capitalizeWords(input));
        // Output shows each word's first letter capitalized properly.
    }
}
