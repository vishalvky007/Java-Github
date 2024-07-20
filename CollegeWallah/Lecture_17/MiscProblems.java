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

  // static int[] reverseArray(int[] arr) {
  //   int n = arr.length;
  //   int[] ans = new int[n];
  //   int j = 0;

  //   // traverse original array in reverse direction
  //   for(int i=n-1; i>=0; i--) {
  //     ans[j++] = arr[i];
  //   }

  //   return ans;
  // }
  
  static void swapInArray(int[] arr, int i, int j) {

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void reverseArray(int[] arr) {
    int i=0, j=arr.length-1;

    while(i<j) {
      swapInArray(arr,i,j);
      i++;
      j--;
    }
  }

  static void printArray(int[] arr) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] +" ");
    }
    System.out.println();
  }

  static int[] rotate(int[] arr, int k) {
    int n = arr.length;
    k = k % n;
    int[] ans = new int[n];
    int j = 0;

    for(int i=n-k; i<n; i++) {
      ans[j++] =  arr[i];
    }

    for(int i=0; i<n-k; i++) {
      ans[j++] = arr[i];
    }

    return ans;

  }

  static void reverseToFrom(int arr[], int i, int j) {
    while(i<j) {
      swapInArray(arr, i, j);
      i++;
      j--;
    }
  }


  static void rotateInPlace(int[] arr, int k) {
    int n = arr.length;
    k = k % n;
  
    reverseToFrom(arr, 0, n-k-1);
    reverseToFrom(arr, n-k, n-1);
    reverseToFrom(arr, 0, n-1);

  }


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = 9;
    int b = 3;
    int[] arr = {1,2,3,4,5};
    // printArray(arr);

    // swap(a, b);
    // swapWithoutTemp(a, b);
    // int[] ans = reverseArray(arr);
    // reverseArray(arr);
    // printArray(arr);  


    /* Rotate array main code */
    /*  
    System.out.print("Enter k: ");
    int k = sc.nextInt();

    System.out.print("Original array: ");
    printArray(arr);

    int[] ans = rotate(arr, k);
    System.out.print("Array after rotation: ");
    printArray(ans);
    */
    
    /* Rotate Array In-place */
    System.out.print("Enter k: ");
    int k = sc.nextInt();

    System.out.print("Original array: ");
    printArray(arr);

    rotateInPlace(arr, k);
    System.out.print("Array after rotation: ");
    printArray(arr);
  }
}