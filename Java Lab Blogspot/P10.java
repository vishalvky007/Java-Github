import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the base and height from the user
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = (base * height) / 2;

        // Display the result
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);

        // Close the scanner
        scanner.close();
    }
}
