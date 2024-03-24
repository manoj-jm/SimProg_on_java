public class Pattern {
  public static void main(String[] args) {
    int n = 5;
    // pattern 1
    System.out.println("pattern 1");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("pattern 2");
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // pattern 3
    System.out.println("pattern 3");

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // pattern 4
    System.out.println("pattern 4");
    for (int i = 1; i <= n; i++) {
      // Print spaces for leading spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      
      // Print asterisks for the current row
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println(); // Move to the next line after each row
    }
  }
}
