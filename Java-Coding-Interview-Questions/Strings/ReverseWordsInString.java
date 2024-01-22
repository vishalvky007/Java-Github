// How to reverse words in String in Java?
/*
Input: Welcome to Java World
Output: World Java to Welcome
*/

public class ReverseWordsInString {
    
    public static void main(String[] args) {
        String str= "Welcome to Java World";
        String splitArray[] = str.split(" ");

        for(int i=splitArray.length-1;i>=0;i--) {
            System.out.print(splitArray[i]+" ");
        }
        System.out.println();
    }
}
