/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)
*/
package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSorter {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Violet");

        // Display the original list
        System.out.println("Original list of colors: " + colors);

        // Sort the list using Collections.sort()
        Collections.sort(colors);

        // Display the sorted list
        System.out.println("Sorted list of colors: " + colors);
    }
}
