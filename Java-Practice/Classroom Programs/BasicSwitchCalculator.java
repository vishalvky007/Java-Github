import java.util.Scanner;

public class BasicSwitchCalculator {
    
    public static void main(String[] args) {
        float num1, num2;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        System.out.println("Enter the operator (+,-,*,/):");

        char op = sc.next().charAt(0);
        float result = 0;

        switch(op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("You entered wrong input");
        }
        System.out.println("The final result is: ");
        System.out.println();
        System.out.println(num1+" "+op+" "+num2+" = "+result);

        sc.close();
    }
}
