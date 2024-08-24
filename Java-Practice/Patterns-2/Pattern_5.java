public class Pattern_5 {
  public static void main(String[] args) {
    
    int n = 5;
    
    // for(int i=0; i<n; i++) {
    //   for(int j=0; j<=i; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // for(int i=1; i<n; i++) {
    //   for(int j=0; j<n-i; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    for(int i=0; i<2*n-1; i++) {
      int stars = i < n ? i+1 : 2*n-i-1;
      for(int j=0; j<stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
