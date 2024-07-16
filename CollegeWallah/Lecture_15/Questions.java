package Lecture_15;

import java.util.Scanner;
import java.util.Arrays;

public class Questions {

  static int[] KthsmallestAndLargest(int arr[], int k) {

    int[] emptyArray = new int[1];

    if(k < 1 || k > arr.length) {
      return emptyArray;
    }

    Arrays.sort(arr);
    int[] newArr = {arr[k-1], arr[arr.length-k]};

    return newArr;
  }

  static int[] smallestAndLargest(int arr[]) {

    Arrays.sort(arr);
    int[] newArr = {arr[0], arr[arr.length-1]};
    
    return newArr;
  }

  static boolean isSorted(int[] arr) {

    boolean check = true;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        check = false;
        break;
      }
    }
    return check;
  }

  static int strictlyGreater(int arr[], int x) {

    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > x) {
        count++;
      }
    }
    return count;
  }

  static int lastOccurence(int[] arr, int x) {

    int lastIndex = -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        lastIndex = i;
      }
    }

    return lastIndex;
  }

  static int countOccurences(int[] arr, int x) {

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        count++;
      }
    }
    return count;
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

    System.out.println("Enter x");
    int x = sc.nextInt();

    // System.out.println("Count of x: "+ countOccurences(arr, x));
    // System.out.println("Last Occurence of x: "+ lastOccurence(arr, x));
    // System.out.println("Stricly Greater than x: "+ strictlyGreater(arr, x));
    // System.out.println("Is sorted "+ isSorted(arr));

    // int[] ans = smallestAndLargest(arr);
    // System.out.println("Smallest " + ans[0]);
    // System.out.println("Largest " + ans[1]);

    int[] ans = KthsmallestAndLargest(arr, x);
    System.out.println("Smallest " + ans[0]);
    System.out.println("Largest " + ans[1]);

    sc.close();
  }
}
