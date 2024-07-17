package Lecture_16;

import java.util.Scanner;

public class ThreeSum {

  static int threeSum(int[] arr, int target) {
    int ans = 0;
    int n = arr.length;
    for(int i=0; i<n; i++) {
      for(int j=i+1; j<n; j++) {
        for(int k=j+1; k<n; k++) {
          if(arr[i] + arr[j] + arr[k] == target) {
            ans++;
          }
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
    threeSum(arr, target);

    System.out.println("Number of pairs: " + threeSum(arr, target));

    sc.close();
  }
}
