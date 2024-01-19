import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        long factorial = 1;

        // for (int i = 1; i <= num; i++) {
        //     factorial = factorial * i;
        // }

        for(int i=num; i>=1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of a Number is: "+factorial);

        sc.close();

    }
}
