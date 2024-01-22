// Write a java program to remove duplicates from String in java?
/*
Ex: sandeep
Output: sandep

Ex: java
Output: jav

Steps:
1) Create a String in which duplicates has to be removed.
2) Write a method removeDuplicates which accepts Strings 
and it should return string.
3) In removeDuplicates method create a hashset.
4) Create a StringBuffer.
5) Loop through the each character in the String.
6) Take each character from String and check in hashset if it 
is not present in hashset add to hashset and Stringbuffer.
7) After iterating each character in string return the string
object from the method.

 */

import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "sandeep";
        System.out.println(removeDuplicates(str));

    }

    public static String removeDuplicates(String str) {

        Set<Character> set = new HashSet<>();
        StringBuffer sf = new StringBuffer();

        for(int i=0; i<str.length(); i++) {
            Character c = str.charAt(i);

            if(!set.contains(c)) {
                set.add(c);
                sf.append(c);
            }
        }
        
        return sf.toString();
    }
}