//2 a. Develop a java program for performing various string operations with different string handling functions directed as followsString Creation and Basic Operations, Length and Character Access, String Comparison, StringSearching, Substring Operations , String Modification, Whitespace Handling, StringConcatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email withcontains( ) and startsWith() and endsWith()
package prgm2;

public class StringOperations {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        System.out.println("Does str1 contain 'll'? " + str1.contains("ll"));
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));

        // 5. Substring Operations
        System.out.println("Substring of str1 from 1 to 4: " + str1.substring(1, 4));

        // 6. String Modification
        String replaced = str1.replace('l', 'p');
        System.out.println("After replacing 'l' with 'p': " + replaced);

        // 7. Whitespace Handling
        String strWithSpaces = "   Java Programming   ";
        System.out.println("Original with spaces: '" + strWithSpaces + "'");
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String joined = str1 + " " + str2;
        System.out.println("Concatenated string: " + joined);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] fruitArray = fruits.split(",");
        System.out.println("Split result:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" Middle");
        sb.append(" End");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email
        String email = "example@gmail.com";
        boolean isValid = email.contains("@") &&
                          email.startsWith("example") &&
                          email.endsWith(".com");
        System.out.println("Email: " + email);
        System.out.println("Is email valid? " + isValid);
    }
}
