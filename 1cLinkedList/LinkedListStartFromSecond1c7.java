package prgm;
import java.util.*;

public class LinkedListStartFromSecond1c7{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("LinkedList: " + list);
        System.out.println("Iterating from the 2nd element:");

        Iterator<String> iterator = list.listIterator(1);  // start from index 1
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}
