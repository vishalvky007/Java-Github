public class Pattern_9 {
  public static void main(String[] args) {
    int n = 5;
    for(int i=0; i<n; i++) {
      for(int k=0; k<i; k++) {
        System.out.print(" ");
      }
      for(int j=2*n-2*i-1; j>0; j--) {
        System.out.print("*");
      }
      for(int k=0; k<i; k++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
