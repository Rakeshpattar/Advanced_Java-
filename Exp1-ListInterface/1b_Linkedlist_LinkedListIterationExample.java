/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
*/
package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterationExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Display the entire list
        System.out.println("Full LinkedList: " + fruits);

        // Create a ListIterator starting from the 2nd position (index 1)
        ListIterator<String> iterator = fruits.listIterator(1);

        // Iterate through the LinkedList starting at index 1
        System.out.println("Iterating from the 2nd position:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
