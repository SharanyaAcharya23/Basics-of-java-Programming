package prgm;

import java.util.*;

public class ListOperationsDemo {

    public static void main(String[] args) {
        // Initial Lists
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        addElements(arrayList);
        addElements(linkedList);

        // 2. Add element at specific index
        addElementAtIndex(arrayList, 1, "Grapes");
        addElementAtIndex(linkedList, 1, "Grapes");

        // 3. Add multiple elements
        addMultipleElements(arrayList, Arrays.asList("Mango", "Pineapple"));
        addMultipleElements(linkedList, Arrays.asList("Mango", "Pineapple"));

        // 4. Accessing elements
        accessElement(arrayList, 2);
        accessElement(linkedList, 2);

        // 5. Updating elements
        updateElement(arrayList, 0, "Strawberry");
        updateElement(linkedList, 0, "Strawberry");

        // 6. Removing elements
        removeElement(arrayList, "Banana");
        removeElement(linkedList, "Banana");

        // 7. Searching elements
        searchElement(arrayList, "Orange");
        searchElement(linkedList, "Orange");

        // 8. List size
        printSize(arrayList);
        printSize(linkedList);

        // 9. Iterating over list (for-each)
        iterateList(arrayList);
        iterateList(linkedList);

        // 10. Using Iterator
        iterateWithIterator(arrayList);
        iterateWithIterator(linkedList);

        // 11. Sorting
        sortList(arrayList);
        sortList(linkedList);

        // 12. Sublist
        getSublist(arrayList, 0, 2);
        getSublist(linkedList, 0, 2);

        // 13. Clearing the list
        clearList(arrayList);
        clearList(linkedList);
    }

    static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);
    }

    static void addElementAtIndex(List<String> list, int index, String element) {
        list.add(index, element);
        System.out.println("After adding at index " + index + ": " + list);
    }

    static void addMultipleElements(List<String> list, List<String> elements) {
        list.addAll(elements);
        System.out.println("After adding multiple elements: " + list);
    }

    static void accessElement(List<String> list, int index) {
        String element = list.get(index);
        System.out.println("Element at index " + index + ": " + element);
    }

    static void updateElement(List<String> list, int index, String newElement) {
        list.set(index, newElement);
        System.out.println("After updating index " + index + ": " + list);
    }

    static void removeElement(List<String> list, String element) {
        list.remove(element);
        System.out.println("After removing element '" + element + "': " + list);
    }

    static void searchElement(List<String> list, String element) {
        boolean found = list.contains(element);
        System.out.println("List contains '" + element + "': " + found);
    }

    static void printSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    static void iterateList(List<String> list) {
        System.out.print("Iterating (for-each): ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    static void iterateWithIterator(List<String> list) {
        System.out.print("Iterating (Iterator): ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }

    static void getSublist(List<String> list, int fromIndex, int toIndex) {
        List<String> sub = list.subList(fromIndex, Math.min(toIndex, list.size()));
        System.out.println("Sublist (" + fromIndex + "-" + toIndex + "): " + sub);
    }

    static void clearList(List<String> list) {
        list.clear();
        System.out.println("After clearing: " + list);
    }
}
