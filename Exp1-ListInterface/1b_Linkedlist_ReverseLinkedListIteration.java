/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())
*/
package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> colors = new LinkedList<>();

        // Add some elements to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Get the descending iterator
        Iterator<String> reverseIterator = colors.descendingIterator();

        // Iterate in reverse order
        System.out.println("LinkedList in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
