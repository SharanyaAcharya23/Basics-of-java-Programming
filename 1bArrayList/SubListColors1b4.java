package prgm;

import java.util.*;

public class SubListColors1b4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original Colors List: " + colors);

        List<String> subList = colors.subList(0, 2);  // index 0 to 1
        System.out.println("SubList (1st and 2nd elements): " + subList);
    }
}
