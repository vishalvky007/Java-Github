import java.util.Scanner;

class CompoundInterest {
    private double principal;
    private double rate;
    private int n;
    private int years;
    private double amount; 

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the annual interest rate (as decimal): ");
        rate = sc.nextDouble();

        System.out.print("Enter number of times interest is compounded per year: ");
        n = sc.nextInt();

        System.out.print("Enter the number of years: ");
        years = sc.nextInt();

        sc.close();

    }
    

    public double calculateCompundInterest() {
        
        amount = principal * Math.pow(1+(rate/n),n*years); 
        return amount;
    }

    public double returnInterest() {
        double interest = amount - principal;
        return interest;
    }
}


public class P13 {
    public static void main(String[] args) {
        CompoundInterest obj = new CompoundInterest();

        obj.input();
        double amt = obj.calculateCompundInterest();
        double interest = obj.returnInterest();
        System.out.printf("The value of the investment is: %.2f%n", amt);
        System.out.printf("The interest earned is: %.2f%n", interest);

    }
}
