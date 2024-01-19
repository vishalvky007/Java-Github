import java.util.Scanner;

/**
 * CountNumberOfDigits
 */
public class CountNumberOfDigits {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        long num = sc.nextLong();
        int count = 0;
        while(num!=0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of Digits: "+count);
        sc.close();
    }
}