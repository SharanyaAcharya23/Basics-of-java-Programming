// Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()
package prgm3;

import java.util.Random;

public class GenerateRandomString {
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Random String: " + generateRandomString(10));
        // Output is a random alphanumeric string of length 10.
    }
}
