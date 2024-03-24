import java.util.Scanner;

public class SumofOdd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the number :");
    int n = in.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
      } else {
        sum += i;
      }
    }

    System.out.println("sum of odd number only :" + sum);

  }
}
