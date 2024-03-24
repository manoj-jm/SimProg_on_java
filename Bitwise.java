public class Bitwise {
  public static void main(String[] args) {
    int a = 5, b = 3;
    System.out.println(a & b);// 1
    System.out.println(a | b);// 7
    System.out.println(a ^ b);// 6
    System.out.println(~b);// -4
    System.out.println(b << 1);// 6 (3 * 2^1) , where 1 is no of shifts
    System.out.println(a >> 2);// 1 (5 / 2^2)
    System.out.println(a << 2);// 20

    // even or odd using bitwize
    int c = 2342322;
    if ((c & 1) == 0) {
      System.out.println("even number ");
    }
  }
}
