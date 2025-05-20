/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()
*/
package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ColorListExample {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add different colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Extract the 1st and 2nd elements using subList (index 0 to 2, exclusive of 2)
        List<String> subColors = colors.subList(0, 2);

        // Display the extracted sublist
        System.out.println("Extracted colors (1st and 2nd): " + subColors);
    }
}
