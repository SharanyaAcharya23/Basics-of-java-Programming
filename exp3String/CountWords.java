

//Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()
package prgm3;

public class CountWords {
 public static int countWords(String str) {
     if (str == null || str.trim().isEmpty()) return 0;
     return str.trim().split("\\s+").length;
 }

 public static void main(String[] args) {
     String input = "Welcome to Java Programming";
     System.out.println("Word count: " + countWords(input));
     // Output shows the number of words correctly counted as 4.
 }
}
