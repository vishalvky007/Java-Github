import java.util.Scanner;

/**
 * CountEvenAndOddDigits
 */
public class CountEvenAndOddDigits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int evenCount = 0, oddCount = 0;

        while(num>0) {
            int rem = num % 10;

            if(rem % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num = num / 10;
        }

        System.out.println("Even number count: "+evenCount);
        System.out.println("Odd number count: "+oddCount);

        sc.close();
    }
}