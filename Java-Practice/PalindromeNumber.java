import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int num = sc.nextInt();

        int org_num = num;

        int rev = 0;

        while(num!=0) {
            rev = rev*10 + num % 10;    // Finds the last digit of the number
            num = num/10;               // Reduces the number by one digit
        }

        if(org_num==rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println("");

        sc.close();
    }
}
