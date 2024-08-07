package Lecture_16;

import java.util.Scanner;

public class PairSum {

  static int pairSum(int[] arr, int target) {
    int n = arr.length;
    int ans = 0;

    for(int i=0; i<n; i++) { // first number
      for(int j=i+1; j<n; j++) { // second number
        if(arr[i] + arr[j] == target) {
          ans++;
        }
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter " + n + " elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter target sum: ");
    int target = sc.nextInt();
    pairSum(arr, target);

    System.out.println("Number of pairs: " + pairSum(arr, target));

    sc.close();
  }
}
