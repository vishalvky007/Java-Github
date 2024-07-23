import java.util.Scanner;

public class SortArray {

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void sortZeroesAndOnes(int[] arr) {

    int n = arr.length;
    int zeroes = 0;

    // count number of zeroes
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        zeroes++;
      }
    }

    // 0 to zeroes-1 : 0, zeroes to n-1 : 1
    for(int i=0; i<n; i++) {
      if(i<zeroes) {
        arr[i] = 0;
      } else {
        arr[i] = 1;
      }
    }
  }

  static void sortZeroesAndOnesInPlace(int [] arr) {
    int n = arr.length;
    int i = 0, j = arr.length-1;
    while(i<j) {
      if(arr[i] == 1 && arr[j] == 0) {
        swap(arr,i,j);
      }
      if(arr[i] == 0) {
        i++;
      }
      if(arr[j] == 1) {
        j--;
      }
    }
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

    System.out.print("Original Array: ");
    printArray(arr);
    // sortZeroesAndOnes(arr);
    sortZeroesAndOnesInPlace(arr);
    System.out.print("Sorted Array: ");
    printArray(arr);

  }
}
