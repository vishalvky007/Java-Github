package Lecture_16;

import java.util.Scanner;

public class RepeatingNumber {

  static int lastRepeatingNumber(int[] arr) {
    int n = arr.length;

    for(int i=n-1; i>=0;i--) {
      for(int j=i-1; j>=0; j--) {
        if(arr[i] == arr[j]) {
          return arr[i];
        }
      }
    }
    return -1;
  }

  static int firstRepeatingNumber(int[] arr) {
    int n = arr.length;

    for(int i=0; i<n; i++) {
      for(int j=i+1; j<n; j++) {
        if(arr[i] == arr[j]) {
          return arr[i];
        }
      }
    }
    return -1;
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
  
      System.out.println("First repeating number is : " + firstRepeatingNumber(arr));
      System.out.println("Last repeating number is : " + lastRepeatingNumber(arr));
  
      sc.close();
    }
}
