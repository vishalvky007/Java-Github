import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter width of rectangle: ");
        float width = sc.nextFloat();
        float perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle is: "+perimeter);

        sc.close();
    }
}
