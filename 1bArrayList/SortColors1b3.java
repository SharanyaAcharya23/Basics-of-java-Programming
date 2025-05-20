//4. Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)
package prgm;

import java.util.*;

public class SortColors1b3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Yellow", "Red", "Green", "Blue"));
        System.out.println("Original Colors List: " + colors);

        Collections.sort(colors);
        System.out.println("Sorted Colors List: " + colors);
    }
}
