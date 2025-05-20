package prgm;

import java.util.*;

public class DisplayWithPositions1c10 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("LinkedList: " + list);
        System.out.println("Displaying elements with their positions:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at position " + i + ": " + list.get(i));
        }
    }
}
