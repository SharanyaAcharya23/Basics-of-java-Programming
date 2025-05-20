//1. Write a java program for getting different colors through ArrayList interface and search whether
//the color "Red" is available or not
package prgm;

import java.util.*;

public class SearchColor1b1 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Colors List: " + colors);

        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is not available in the list.");
        }
    }
}
