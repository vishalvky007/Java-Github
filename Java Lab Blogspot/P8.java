import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter width of rectangle: ");
        float width = sc.nextFloat();
        float area = length * width;
        System.out.println("Area of Rectangle is: "+area+" units");

        sc.close();
    }
}
