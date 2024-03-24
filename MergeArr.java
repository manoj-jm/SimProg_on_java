import java.util.Arrays;

public class MergeArr {
  public static void main(String[] args) {
    int arr1[] = { 12, 34, 11, 89, 8, 3, 45, 29, 50, 1 };
    int arr2[] = { 90, 2, 42, 9, 98, 23, 90, 8 };
    int arr3[] = new int[arr1.length + arr2.length];
    int k = 0;
    for (int i = 0; i < arr1.length; i++) {
      arr3[i] += arr1[i];
      k = i;
    }
    for (int i = 0; i < arr2.length; i++) {
      if (i == arr2.length) {
        arr3[k] += arr2[i];
        k--;
        break;
      }
      arr3[k] += arr2[i];
      k++;
    }

    System.out.println(Arrays.toString(arr3));//getting 0 at last ?
  }
}
