public class GCDLCM {

  public static void main(String[] args) {
    int num1 = 12;
    int num2 = 18;

    int gcd = calculateGCD(num1, num2);
    int lcm = calculateLCM(num1, num2, gcd);

    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
  }

  public static int calculateGCD(int a, int b) {
    // Use Euclidean Algorithm for GCD
    if (b == 0) {
      return a;
    } else {
      return calculateGCD(b, a % b);
    }
  }

  public static int calculateLCM(int a, int b, int gcd) {
    // LCM can be calculated using GCD formula: LCM = (a * b) / GCD
    return (a * b) / gcd;
  }
}