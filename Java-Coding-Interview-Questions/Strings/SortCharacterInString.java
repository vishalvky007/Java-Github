// WAP in Java to Sort Characters in String.
/*
Ex: java aavj 

Steps:
1) Take one string as input.
2) Convert first string to character array.
3) Sort the character in array using arrays.sort() method.
4) Construct string by using sorted character array.
*/

import java.util.Arrays;

public class SortCharacterInString {

    public static void main(String[] args) {
        String str = "java";
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        String sortedStr = new String(ch);
        System.out.println(sortedStr);
    }
}


