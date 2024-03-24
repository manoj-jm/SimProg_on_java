import java.util.Scanner;

public class TwoDArr {

  public static void main(String[] args) {
    // search an element in a 2-D array. and sum and average also
    int[][] arr = { { 1, 2, 3 }, { 43, 23, 19 }, { 90, 87, 90, 293 } };
    Scanner in = new Scanner(System.in);
    System.out.println("enter key to search ? : ");
    int k = in.nextInt();
    boolean f = true;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == k) {
          f = true;
        } else {
          f = false;
        }
      }
    }

    if (f) {
      System.out.println("found!! the key :)");

    } else {
      System.out.println("not found key:(");
    }

    // sum and average
    int sum = 0, aver = 0, count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        sum = sum + arr[i][j];
        count++;
      }
    }
    System.out.println("number of elements :" + count);
    System.out.println("sum is :" + sum);
    System.out.println("average is :" + sum / count);
  }
}

/**
 * output
 * enter key to search ? :
 * 293
 * found!! the key :)
 * number of elements :10
 * sum is :651
 * average is :65
 */