package prgm;

import java.util.*;

public class InsertAtEnd1c9 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");

        System.out.println("Original LinkedList: " + list);
        list.offerLast("Pink");
        System.out.println("LinkedList after inserting 'Pink' at the end: " + list);
    }
}
