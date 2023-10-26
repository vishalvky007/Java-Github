import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int num3 = sc.nextInt();

        // Approach-1  
        /*
        if(num1>num2 && num1>num3) {
            System.out.println("Largest is "+num1);
        }
        else if(num2>num1 && num2>num3) {
            System.out.println("Largest is "+num2);
        }
        else {
            System.out.println("Largest is "+num3);
        }
        */

        // Approach-2
        int largest1 = num1>num2 ? num1 : num2;
        int largest2 = largest1>num3 ? largest1 : num3;

        System.out.println("Largest is "+largest2);



        sc.close();
    }
}
