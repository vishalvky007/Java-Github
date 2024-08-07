package Lecture_17;

import java.util.Scanner;

public class PresentQuery {

  static int[] makeFrequencyArray(int[] arr) {
    int[] freq = new int[100000];

    for(int i=0; i<arr.length; i++) {
      freq[arr[i]]++;
    }

    return freq;
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

    int[] freq = makeFrequencyArray(arr);

    System.out.print("Enter number of queires: ");
    int q = sc.nextInt();

    while(q > 0) {
      System.out.print("Enter number to be searched: ");
      int x = sc.nextInt();
      if(freq[x] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
      q--;
    }

    sc.close();
  }
}
