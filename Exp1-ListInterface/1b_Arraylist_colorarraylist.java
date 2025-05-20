/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index
*/
package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Get the index of the element to remove from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index (starting from 0) of the color to remove: ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < colors.size()) {
            // Remove the element at the given index
            String removedColor = colors.remove(index);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid index. No color removed.");
        }

        // Display the updated list
        System.out.println("Updated color list: " + colors);
    }
}
