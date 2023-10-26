import java.text.DecimalFormat;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius is circle: ");
        double radius = sc.nextFloat();
        double area = Math.PI * Math.pow(radius, 2);

        // Create a DecimalFormat object for rounding to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        String formattedArea = df.format(area);

        System.out.println("Area of circle is: " + formattedArea + " units");
        sc.close();

    }
}
