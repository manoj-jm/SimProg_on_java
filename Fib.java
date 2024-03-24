public class Fib {
  public static void main(String[] args) {
    int n = 5, cn = 0;// up to 5th fibonacci numbers
    int first_num = 0, second_num = 1;
    System.out.println(first_num);
    System.out.println(second_num);
    for (int i = 0; i < n; i++) {
      cn = first_num + second_num;
      System.out.println(cn + "");
      first_num = second_num;
      second_num = cn;
    }
  }
}
