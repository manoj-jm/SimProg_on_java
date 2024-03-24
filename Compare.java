public class Compare {
  public static void main(String[] args) {
    int a = 12;
    int b = 14;
    if (a > 0) {// to check for positive
      if (a % 2 == 0) {// to check for even or odd
        if (a > b) {// to check it is bigger number
          System.out.println("a is greatest , a is positive and even also ");
        } else {
          System.out.println("b is  greatest , b is positive and b is even also");
        }
      } else {
        if (a > b) {
          System.out.println("a is greatest , a is positive and a is  odd  ");
        } else {
          System.out.println("b is  greatest , b is positive and b is odd ");
        }
      }
    } else {
      System.out.println("a is negative number !");
    }
  }
}
