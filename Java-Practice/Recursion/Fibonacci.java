
/**
 * Fibonacci Series: 0,1,1,2,3,5,8,13,21,34,55.....
 */

import java.util.Scanner;

class Fibonacci {

    public static int fib(int m) {

        // base case
        if (m <= 1) {
            return m;
        }
        // recursive case
        else
            return fib(m - 1) + fib(m - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms of fibonacci series: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid value of n");
        } 
        else {
            System.out.print("Fibonacci Series is: ");
            for (int i = 0; i < n; i++) {
                System.out.print(fib(i) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
