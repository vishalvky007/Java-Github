public class Swapping2Numbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping values are.." + a + " " + b);

        // Logic-1: Use Third variable
        /*
        int t = a;
        a = b;
        b = t;
        */

        // Logic-2: Addition & Subtraction (without using third variable)
        /*
        a=a+b;  // 10+20=30
        b=a-b;  // 30-20=10
        a=a-b;  // 30-10=20
        */

        // Logic-3: Multiplication & Division (without third variable)
        // here a & b values should not be zero
        /* 
        a=a*b;  // 10*20=200
        b=a/b;  // 200/20=10
        a=a/b;  // 200/10=20
        */

        // Logic-4: Bitwise XOR(^)
        /*
        a=a^b;  // 10^20=30
        b=a^b;  // 30^20=10
        a=a^b;  // 30^10=20
        */

        // Logic-5: Single statement
        // a=10, b=20
        b=a+b-(a=b);

        System.out.println("After swapping values are.." + a + " " + b);
    }
}