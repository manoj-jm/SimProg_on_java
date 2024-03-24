public class Sorted {
  public static void main(String[] args) {
    // check if the array is sorted , delete some element form the array and reverse
    // the array

    int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3 };
    isSorted(arr);
    // delete(arr);
    reverse(arr, arr.length);
  }

  public static void isSorted(int[] arr) {
    int flag = 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < arr[i + 1]) {
        // in ascending order
        flag = 0;
      } else {
        flag = 1;
        break;
      }
    }
    if (flag == 1) {
      System.out.println("it is not sorted");
    } else {
      System.out.println("sorted");
    }
  }

  static void reverse(int[] arr, int length) {
    System.out.print("[");
    for (int i = length - 1; i > 0; i--) {
      System.out.print(arr[i] + ",");
    }
    System.out.print("]");

  }
}
