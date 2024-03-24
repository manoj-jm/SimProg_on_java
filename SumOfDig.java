public class SumOfDig {
  public static void main(String[] args) {
    int n = 1234432;
    int sum = 0, r = 0;
    while (n != 0) {
      r = n % 10;
      sum += r;
      n /= 10;
    }

    System.out.println("sum of the digits : " + sum);
  }
}
