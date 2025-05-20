package prgm;

import java.util.*;

public class RemoveNthColor1b5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original Colors List: " + colors);

        int n = 2;  // Example: Remove 3rd element (index 2)
        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After removing element at index " + n + ": " + colors);
        } else {
            System.out.println("Index " + n + " is out of bounds.");
        }
    }
}
