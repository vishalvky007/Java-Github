package Lecture_15;

/**
 * Main
 */
public class Main {

  static void printArray(int[] arr) {

    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  static void shallowCopy(int[] arr) {

    // Shallow Copy
    int[] arr_2 = arr;
    System.out.print("\nCopied Array: ");
    printArray(arr_2);

    arr_2[0] = 0;
    arr_2[1] = 0;

    System.out.print("After Change Original Array: ");
    printArray(arr);
    System.out.print("After Change Copied Array: ");
    printArray(arr_2);
  }

  static void deepCopy(int[] arr) {
    
    // Deep Copy
    int[] arr_2 = arr.clone();
    System.out.print("\nCopied Array: ");
    printArray(arr_2);

    arr_2[0] = 23;
    arr_2[1] = 21;

    System.out.print("After Change Original Array: ");
    printArray(arr);
    System.out.print("After Change Copied Array: ");
    printArray(arr_2);
  }

  public static void main(String args[]) {

    int[] arr = new int[3];

    arr[0] = 12;
    arr[1] = 13;
    arr[2] = 14;

    System.out.print("Original Array: ");  
    printArray(arr);

    shallowCopy(arr);

    deepCopy(arr);
    
  }
}