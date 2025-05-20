/*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package string;
import java.util.Scanner;

public class ReverseStringProgram {

    // User-defined function to reverse a string
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        // Calling the reverseString() function
        String reversed = reverseString(original);

        // Displaying the reversed string
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
