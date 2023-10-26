public class P6 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, temp;

        System.out.println("Before swap numbers are: "+num1+" "+num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swap numbers are: "+num1+" "+num2);

    }
}
