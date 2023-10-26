/* WAP to print prime number in pair like 13,31. */
/* 
 * The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 
 *  37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
 */

 // Build an Array to store all two digits numbers

class PrimePairs {

    int arr[] = 

    public boolean isPrime(int n) { 
        // Corner case 
        if (n <= 1) 
            return false; 

        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
        {
            if (n % i == 0) 
                return false;
        }
        return true; 
    } 

    public void findPrimes() {
        System.out.print("Two digit Primes numbers are: ");
        for(int i=10;i<100;i++) {
            if(isPrime(i)) {
                if(reverse(i) == i)
                {
                    System.out.print(" "+i);
                }
            }
        }
        System.out.println();
    }

    public int r(int num) {
        int rev = 0;
        
        while(num >0) {
            rev = rev * 10 + num%10;
            num = num/10;
        }

        return rev;
    }

    // public void checkPair() {

    //      for(int i=10;i<100;i++) {
    //         for(int j=10;j<100;j++) {
    //             if(isPrime(i) ) {
    //             System.out.print(" "+i);
    //         }
    //         }
            
    //     }
    // }


    
}

public class P1_a {
    public static void main(String[] args) {
        PrimePairs x = new PrimePairs();
        x.findPrimes();
        // System.out.println(x.reverse(12));

    }
}


