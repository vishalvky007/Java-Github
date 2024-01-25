// WAP in Java to arrange words in a string on the basis of first character of each word. Arrange alphabetically.
/*
Input String: Hello my name is John Jacobs
Output: Hello is John Jacobs my name
*/

import java.util.Arrays;

public class ArrangeStringWords {

    public static void main(String[] args) {
        String input = "Hello my name is John Jacobs";
        String output = arrangeWords(input);
        System.out.println("Input String: "+input);
        System.out.println("Output: "+output);
    }

    public static String arrangeWords(String input) {
        String[] words = input.split("\\s+"); // Split the input string into words
        Arrays.sort(words, (a,b) -> Character.compare(a.charAt(0), b.charAt(0)));

        return String.join(" ", words); // Join the sorted words back into a string
    }

}
