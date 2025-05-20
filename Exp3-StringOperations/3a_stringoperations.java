/*3a. Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/
package stringOperations;
public class StringOperations {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Welcome";
        String str2 = new String("AIET");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 3 in str1: " + str1.charAt(3));

        // 3. String Comparison
        String str3 = "welcome";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        System.out.println("str1 contains 'come': " + str1.contains("come"));
        System.out.println("Index of 'e' in str1: " + str1.indexOf('e'));
        System.out.println("Last index of 'e' in str1: " + str1.lastIndexOf('e'));

        // 5. Substring Operations
        System.out.println("Substring of str1 (1 to 4): " + str1.substring(1, 4));

        // 6. String Modification
        String modifiedStr = str1.replace("e", "a");
        System.out.println("Modified String: " + modifiedStr);

        // 7. Whitespace Handling
        String strWithSpaces = "   AIET College   ";
        System.out.println("Original with spaces: '" + strWithSpaces + "'");
        System.out.println("After trim: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String fullStr = str1 + " to " + str2;
        System.out.println("Concatenated String: " + fullStr);

        // 9. String Splitting
        String csv = "apple,banana,grape,mango";
        String[] fruits = csv.split(",");
        System.out.println("Splitting CSV:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Students");
        sb.insert(5, " Dear");
        sb.replace(0, 5, "Hi");
        sb.delete(3, 8);
        System.out.println("StringBuilder Result: " + sb.toString());

        // 11. String Formatting
        String name = "Ravi";
        int marks = 92;
        String formatted = String.format("Name: %s, Marks: %d", name, marks);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email
        String email = "student@aiet.edu";
        boolean isValidEmail = email.contains("@") && email.startsWith("student") && email.endsWith(".edu");
        System.out.println("Email: " + email);
        System.out.println("Is valid email? " + isValidEmail);
    }
}

