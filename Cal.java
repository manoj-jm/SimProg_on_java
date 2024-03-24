
public class Cal {
  public static void main(String[] args) {
    int a = 12, b = 13;
    char arr[] = { '+', '-', '/', '*', '%' };
    for (int i = 0; i < arr.length; i++) {
      System.out.print(a + " " + arr[i] + " " + b + " = ");

      switch (arr[i]) {
        case '+':
          System.out.println(a + b);
          break;
        case '-':
          System.out.println(a - b);
          break;
        case '/':
          System.out.println(a / b);
          break;
        case '*':
          System.out.println(a * b);
          break;
        case '%':
          System.out.println(a % b);
          break;
        default:
          break;
      }
    }

  }
}