import java.util.Scanner;

public class NumOfOccur {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 2, 2, 3, 4, 3, 3, 3, 3, 3, 3, 938, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 1, -92, 1, 1, 1, };
    // number of occourence and maximum element and minimum
    Scanner in = new Scanner(System.in);
    System.out.println("enter a number to find the occurence : ");
    int count = 0;
    int n_o_c = in.nextInt();
    for (int i : arr) {
      if (i == n_o_c) {
        count++;
      }
    }
    int mx = max(arr);
    int mn = min(arr);
    System.out.println("no of occurence of " + n_o_c + " is " + count);
    System.out.println("maximum element is " + mx);
    System.out.println("minimum element is " + mn);
  }

  public static int max(int[] arr) {

    if(arr==null || arr.length ==0){
      retur  -1;
    }
    int let_max = arr[0];
    for (int i : arr) {
      if (i > let_max) {
        let_max = i;
      }
    }
    return let_max;
  }

  // min
  public static int min(int[] arr) {
    if(arr==null || arr.length ==0){
      retur  -1;
    }
    int let_min = arr[0];
    for (int i : arr) {
      if (i < let_min) {
        let_min = i;
      }
    }
    return let_min;
  }
}
