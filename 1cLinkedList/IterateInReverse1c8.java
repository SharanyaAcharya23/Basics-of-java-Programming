package prgm;

import java.util.*;

public class IterateInReverse1c8 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("LinkedList: " + list);
        System.out.println("Iterating in reverse order:");

        Iterator<String> reverseIterator = list.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println("Element in reverse: " + reverseIterator.next());
        }
    }
}
