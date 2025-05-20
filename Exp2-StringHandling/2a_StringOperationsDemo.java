/*2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/
package stringOperations;
public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));
        System.out.println("str1 contains 'ell': " + str1.contains("ell"));

        // 5. Substring Operations
        System.out.println("Substring of str1 from 1 to 4: " + str1.substring(1, 4));

        // 6. String Modification
        String modified = str1.replace("l", "p");
        System.out.println("Modified str1: " + modified);

        // 7. Whitespace Handling
        String strWithSpaces = "  Trim me  ";
        System.out.println("Before trim: '" + strWithSpaces + "'");
        System.out.println("After trim: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concatenated = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatenated);

        // 9. String Splitting
        String csv = "red,green,blue,yellow";
        String[] colors = csv.split(",");
        System.out.println("Splitting CSV:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "is ");
        sb.replace(5, 8, "was ");
        sb.delete(5, 9);
        System.out.println("StringBuilder content: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        String email = "test@example.com";
        boolean isValidEmail = email.contains("@") && email.startsWith("test") && email.endsWith(".com");
        System.out.println("Is valid email: " + isValidEmail);
    }
}
