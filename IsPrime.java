public class IsPrime {
  public static void main(String[] args) {
    int n = 471, flag = 0;
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        flag = 1;
      }
    }
    if (flag == 0) {
      System.out.println("Prime number");
    } else {
      System.out.println("not a prime number");
    }

    // or
    // int sum =0,r=0;
    // while (n != 0) {
    // r = n % 10;
    // sum += r;
    // n /= 10;
    // }

    // for (int i = 2; i < Math.sqrt(n); i++) {
    // if(sum%i==0){
    // System.out.println("not a prime number");
    // }else{
    // System.out.println("prime number ");
    // }
  }

}
