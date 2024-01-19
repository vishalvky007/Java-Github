import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num=sc.nextInt();   

        // 1. Using Algorithm
        /*
        int rev=0;

        while(num!=0) {
            rev=rev*10 + num%10;
            num=num/10;
        }
        */

        // 2. Using StringBuffer class
        /*
        StringBuffer sb=new StringBuffer(String.valueOf(num));  // String.valueOf() will convert int into String
        StringBuffer rev = sb.reverse();
        */


        // 3. Using StringBuilder class
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();


        System.out.println("Reverse Number is:"+rev);

        sc.close();
    }
}