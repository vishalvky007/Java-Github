// WAP to check if a string is palindrome or not in Java?
/*
Step-1: Input a String.
Step-2: Find the reverse of a String
Step-3: Check the original String and reverse Stirng are same or not.
Step-4: If both are equal print palindrome else print given String
is not palindrome.
*/

import java.util.Scanner;

public class PalindromeStringDemo {
    
    public static void main(String[] args) {

        System.out.print("Enter the input String: ");
        Scanner sc= new Scanner(System.in);
        String original = sc.nextLine();

        String reverse = "";

        for(int i=original.length()-1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)) {
            System.out.println("Given String is Palindrome");
        }
        else {
            System.err.println("Not a Palindrome");
        }

        sc.close();
    }
}
