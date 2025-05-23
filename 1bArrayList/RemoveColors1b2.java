package prgm;

import java.util.*;

public class RemoveColors1b2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original Colors List: " + colors);

        colors.remove(1);  // Remove 2nd element (index 1)
        colors.remove("Blue");  // Remove color "Blue"

        System.out.println("After removing 2nd element and 'Blue': " + colors);
    }
}
