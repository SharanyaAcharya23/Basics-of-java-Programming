package prgm;

import java.util.*;

public class SwapElements1c11 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("Original LinkedList: " + list);
        Collections.swap(list, 0, 2); // swap first and third
        System.out.println("LinkedList after swapping 1st and 3rd elements: " + list);
    }
}
