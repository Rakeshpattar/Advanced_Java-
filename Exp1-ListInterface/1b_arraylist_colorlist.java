/*Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList
*/
import java.util.ArrayList;

public class ColorList {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            colors.remove(1);
            System.out.println("After removing 2nd element: " + colors);
        }

        // Remove the color "Blue"
        boolean removed = colors.remove("Blue");
        if (removed) {
            System.out.println("After removing 'Blue': " + colors);
        } else {
            System.out.println("'Blue' was not found in the list.");
        }
    }
}
