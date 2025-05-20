/*Write a Java program to insert the specified element at the end of a linked list.( using
l\_listobj.offerLast("Pink"))
*/
package LinkedList;
import java.util.LinkedList;

public class InsertAtEndUsingOfferLast {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> colorList = new LinkedList<>();

        // Add some initial colors to the LinkedList
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");

        // Display the original list
        System.out.println("Original LinkedList: " + colorList);

        // Insert "Pink" at the end using offerLast()
        colorList.offerLast("Pink");

        // Display the updated list
        System.out.println("LinkedList after inserting 'Pink' at the end: " + colorList);
    }
}
