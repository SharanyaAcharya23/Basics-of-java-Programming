//Q2. Write a Java Program for Counting how many times a substring appears in a main stringusing user defined function countOccurrences()
package prgm3;
public class CountSubstringOccurrences {
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String main = "banana banana banana";
        String sub = "na";
        System.out.println("Occurrences of '" + sub + "' in main string: " + countOccurrences(main, sub));
    }
}
