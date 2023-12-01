/* WAP to print prime number in pair like 13,31.  
 * The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 
 * 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
 */

import java.util.Scanner;

class PrimePairs {

    public boolean isPrime(int n) { 
        // Corner case 
        if (n <= 1) 
            return false; 

        // Check from 2 to n/2 
        for (int i = 2; i < n/2; i++) 
        {
            if (n % i == 0) 
                return false;
        }
        return true; 
    } 

	public int reverse(int num) {
        int rev = 0;
        
        while(num >0) {
            rev = rev * 10 + num%10;
            num = num/10;
        }
		
        return rev;
    }

    public void printPrimePairs(int n) {

		for(int i=10;i<=n;i++) {
            if(isPrime(i)) {
				int rev = reverse(i);
                if(isPrime(rev)) {
                    System.out.println(i+","+rev);
                }
            }
        }
    }   
}

public class P1_a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the maximum value to search for prime pairs: ");
        int n = sc.nextInt();
		
		PrimePairs x = new PrimePairs();
		
		if(n<=10) {
			System.out.println("No Prime Pairs found!!!");
		}
		else {
			System.out.println("Prime number pairs upto "+n+":");
			x.printPrimePairs(n);
		}

		sc.close();
    }
}


