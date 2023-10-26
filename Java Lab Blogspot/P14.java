/* Write a Program that takes three numbers as input to calculate and print the average of the numbers. */

import java.util.Scanner;

class CalculateAverage {

    private float num1, num2, num3, avg;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number-1: ");
        num1 = sc.nextFloat();
        System.out.print("Enter Number-2: ");
        num2 = sc.nextFloat();
        System.out.print("Enter Number-3: ");
        num3 = sc.nextFloat();
    }

    public float average() {
        avg = (num1+num2+num3)/3;
        return avg;
    }
}

public class P14 {
    public static void main(String[] args) {
        CalculateAverage x = new CalculateAverage();
        x.input();
        float avg = x.average();
        System.out.println("Average is: "+avg);
    }
}
