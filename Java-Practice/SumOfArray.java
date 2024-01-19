import java.util.Scanner;

/**
 * SumOfArray
 */
public class SumOfArray {

    public static void main(String[] args) {

        // int a[] = {5,2,7,9,6};
        // int sum=0;
        // for(int i=0;i<a.length;i++) {
            // sum+=a[i];
        // }

        // Take input from user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        // Declare array 
        int[] arr= new int[size];

        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        int sum=0;

        // Enhanced for loop 
        for(int value:arr) {
            sum=sum+value;
        }

        System.out.println("Sum of array is "+sum);

        sc.close();
    }
}