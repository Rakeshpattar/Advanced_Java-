/*
Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
*/

package arraylistlinkedlist;

import java.util.*;

public class ListOperations {

    public static void main(String[] args) {
        // 1. Creating and Adding elements
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Apple", "Banana", "Orange"));

        System.out.println("Initial ArrayList: " + arrayList);
        System.out.println("Initial LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");
        System.out.println("\nAfter adding 'Mango' at index 1:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);
        System.out.println("\nAfter adding multiple elements:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 4. Accessing elements
        System.out.println("\nElement at index 2 in ArrayList: " + arrayList.get(2));
        System.out.println("Element at index 2 in LinkedList: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(2, "Peach");
        linkedList.set(2, "Peach");
        System.out.println("\nAfter updating index 2 to 'Peach':");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 6. Removing elements
        arrayList.remove("Peach");
        linkedList.remove("Peach");
        System.out.println("\nAfter removing 'Peach':");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 7. Searching elements
        System.out.println("\nDoes ArrayList contain 'Apple'? " + arrayList.contains("Apple"));
        System.out.println("Does LinkedList contain 'Apple'? " + linkedList.contains("Apple"));

        // 8. List size
        System.out.println("\nSize of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 9. Iterating over list using for-each
        System.out.println("\nIterating over ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("Iterating over LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nUsing Iterator on ArrayList:");
        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println("Using Iterator on LinkedList:");
        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\nAfter sorting:");
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        List<String> subArrayList = arrayList.subList(1, 3);
        List<String> subLinkedList = linkedList.subList(1, 3);
        System.out.println("\nSublist of ArrayList (index 1 to 2): " + subArrayList);
        System.out.println("Sublist of LinkedList (index 1 to 2): " + subLinkedList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("\nAfter clearing:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
