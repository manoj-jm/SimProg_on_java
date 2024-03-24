public class Amstrong {
  public static void main(String[] args) {
    // for three digit numbers
    int n = 573;
    int temp = n, sum = 0, r = 0;
    while (n != 0) {
      r = n % 10;
      sum = sum + (r * r * r);
      n /= 10;
    }
    if (sum == temp) {
      System.out.println("Armstrong number");
    } else {
      System.out.println("Not an Armstrong number");
    }

    // 4 digit number
    int remainder = 0, s = 0;
    int len = (int) (Math.log10(Math.abs(n)) + 1);
    while (n != 0) {
      remainder = n % 10;
      s += Math.pow(remainder, len);
      n /= 10;
    }
    if (s == temp) {
      System.out.println("Armstrong number");
    } else {
      System.out.println("Not an Armstrong number");
    }
  }
}
