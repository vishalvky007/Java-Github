import java.util.Scanner;

class SimpleInterest {
    private double principal;
    private double rate;
    private double time;

    public SimpleInterest() {
        this.principal = 0;
        this.rate = 0;
        this.time = 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        time = sc.nextDouble();

        sc.close();
    }

    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }
}

public class P12 {
    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest();
        obj.input();
        double interest = obj.calculateSimpleInterest();
        System.out.println("\nThe simple Interest is " + interest);
    }
}
