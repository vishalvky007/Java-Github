public class P1_gpt {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimePairs(int n) {
        for (int i = 10; i <= n; i++) {
            if (isPrime(i)) {
                int reverse_i = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
                if (isPrime(reverse_i)) {
                    System.out.println(i + "," + reverse_i);
                }
            }
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the maximum value to search for prime pairs: ");
        int n = sc.nextInt();
        System.out.println("Prime number pairs up to " + n + ":");
        printPrimePairs(n);
        sc.close();
    }
}
