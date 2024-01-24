// Write a Java program to print even length words in a String.
/*

Hell -> 4
World -> 5

Input: Hell World
Output: Hell

*/
public class EvenLengthWords {
    
    public static void main(String[] args) {

        String str = "Hell World We lol";

        // "\\s+" is a regular expression that matches one or more whitespace 
        // characters, including spaces,tabs, and newline characters.

        for(String s : str.split("\\s+")) {
            if(s.length() % 2 == 0) {
                System.out.println(s);
            }
        }
    }
}
