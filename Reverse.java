public class Reverse {
  public static void main(String[] args) {
    int n = 3456;
    int temp = n, sum = 0, r = 0;
    while (n != 0) {
      r = n % 10;
      sum = sum * 10 + r;
      n /= 10;
    }

    if (sum == temp) {
      System.out.println("Reverse number is " + sum);
      System.out.println("it is palindrome number");
    } else {
      System.out.println("Reverse number is " + sum);
      System.out.println("it is not palindrome number");
    }
  }
}
