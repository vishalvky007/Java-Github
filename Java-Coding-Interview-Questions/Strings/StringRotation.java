/*

If the input strings are "ABCD" and "BCDA", the isRotation method will return 
true because "BCDA" is a rotation of "ABCD". Here's how it works:

1.Check if the lengths of both strings are the same. 
In this case, both "ABCD" and "BCDA" have a length of 4.

2.Concatenate the first string with itself. 
For "ABCD", the result is "ABCDABCD".

3.Check if the second string is a substring of the concatenated result. 
In this case, "BCDA" is a substring of "ABCDABCD".

Test Case-1:
Input: str1= "ABCD", str2= "CDAB"
Output: Rotation of string is present

Test Case-2:
Input: str1= "ABCD", str2= "BCDA"
Output: Rotation of string is present

Test Case-3:
Input: str1= "ABCD", str2= "CDAF"
Output: Rotation not found

*/

public class StringRotation {
    
    public static void main(String[] args) {
    
        System.out.println("Rotation (ABCD,CDAB) is :"+isRotation("ABCD","CDAB"));
        System.out.println("Rotation (ABCD,BCDA) is :"+isRotation("ABCD","BCDA"));
        System.out.println("Rotation (ABCD,CDAF) is :"+isRotation("ABCD","CDAF"));
    }
    
    public static boolean isRotation(String str1, String str2) {

        return (str1.length() == str2.length()) && ((str1+str1).contains(str2));
    }
}
