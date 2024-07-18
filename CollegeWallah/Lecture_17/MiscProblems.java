package Lecture_17;

import java.util.Scanner;

public class MiscProblems {

  static void swap(int a, int b) {

    System.out.println("Original values before swap");
    System.out.println("a: "+a);
    System.out.println("b: "+b);

    int temp = a;
    a = b;
    b = temp;

    System.out.println("Values after swap");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
  }

  static void swapWithoutTemp(int a, int b) {

    System.out.println("Original values before swap");
    System.out.println("a: "+a);
    System.out.println("b: "+b);

    a = a+b;  // 12 
    b = a-b;  // 9
    a = a-b;  // 3

    System.out.println("Values after swap");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
  }

  static int[] reverseArray(int[] arr) {
    int n = arr.length;
    int[] ans = new int[n];
    int j = 0;

    // traverse original array in reverse direction
    for(int i=n-1; i>=0; i--) {
      ans[j++] = arr[i];
    }

    return ans;
  }

  static void printArray(int[] arr) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] +" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    int a = 9;
    int b = 3;
    int[] arr = {1,2,3,4,5,6};
    printArray(arr);

    // swap(a, b);
    // swapWithoutTemp(a, b);
    int[] ans = reverseArray(arr);
    printArray(ans);

  }
}