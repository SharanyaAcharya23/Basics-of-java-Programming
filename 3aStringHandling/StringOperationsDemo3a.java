package prgm3;

public class StringOperationsDemo3a {
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
        String modified = str1.replace('l', 'x');
        System.out.println("After replacing 'l' with 'x': " + modified);

        // 7. Whitespace Handling
        String spacedStr = "   Java Programming   ";
        System.out.println("Original string with spaces: '" + spacedStr + "'");
        System.out.println("Trimmed string: '" + spacedStr.trim() + "'");

        // 8. String Concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenated);

        // 9. String Splitting
        String data = "Apple,Banana,Orange";
        String[] items = data.split(",");
        System.out.println("Split result:");
        for (String item : items) {
            System.out.println(item);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" -> Middle");
        sb.append(" -> End");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 22;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email
        String email = "student@example.com";
        boolean isValid = email.contains("@") &&
                          email.startsWith("student") &&
                          email.endsWith(".com");

        System.out.println("Email: " + email);
        System.out.println("Is email valid? " + isValid);
    }
}
