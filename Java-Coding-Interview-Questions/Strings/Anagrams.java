// Write a Java program to check two strings are Anagrams 
// or not using Arrays comparison.
/*

Anagrams - Two String are anagrams if they contain same characters 
but in different order. 

Ex: JAVA AVAJ are Anagrams

Steps:
1) Take two Strings as input.
2) Convert two Strings to character array.
3) Sort two character arrays using arrays.sort() method.
4) Compare two Character Arrays if they are equal they are anagrams 
otherwise they are not.

*/

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "avaj";

        System.out.println("Both Strings are Anagrams: "+anagramChecks(str1,str2));

    }

    public static boolean anagramChecks(String str1, String str2) {

        char[] charArrayFromString1 = str1.toCharArray();
        char[] charArrayFromString2 = str2.toCharArray();
        
        Arrays.sort(charArrayFromString1);
        Arrays.sort(charArrayFromString2);

        return Arrays.equals(charArrayFromString1,charArrayFromString2);
    }
}
