import java.util.Arrays;

/**
 * MissingNumberinArray
 */
public class MissingNumberinArray {

    public static void main(String[] args) {

        // Array should not have duplicates
        // Array no need to be in Sorted order
        // Values should be in range

        int a[] = { 1, 2, 4, 5 };

        System.out.println("Missing Number is: " + findMissingNum(a));
    }

    public static int findMissingNum(int a[]) {
        // 1+2+4+5=12 sum1
        // 1+2+3+4+5=15 sum2
        // Sum2-Sum1 = 15-12 = 3 missing

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
        }

        System.out.println("Sum of elements in array: " + sum1);

        int max = Arrays.stream(a).max().getAsInt();

        for (int i = 1; i <= max; i++) {
            sum2 = sum2 + i;
        }
        
        return (sum2-sum1);
    }
}
