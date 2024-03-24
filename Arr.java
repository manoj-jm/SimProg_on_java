

public class Arr {
  public static void main(String[] args) {
    // sum and average of the array
    int arr[] = { 1, 2, 3, 4, 5, 2, 21, 12, 34, 23, 12, 90 };
    int sum = 0, avg = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    avg = sum / arr.length;
    System.out.println("sum of array is " + sum);
    System.out.println("average of array is " + avg);

  }
}
