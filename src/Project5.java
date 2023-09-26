import java.util.Arrays;

public class Project5 {
    /*
    Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
     */
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        if (word1.length() != word2.length()) {
            System.out.println("Words are not anagrams");


            char[] charArray1 = word1.toCharArray();
            char[] charArray2 = word2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("Words are anagrams");
            } else {
                System.out.println("Words are not anagrams");
            }


        }
    }

}