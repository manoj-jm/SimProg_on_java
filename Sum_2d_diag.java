public class Sum_2d_diag {
  public static void main(String[] args) {
    // find the sum of the elements in diagonal i.e,
    int arr[][] = {
        { 10, 2, 32 },
        { 1, 22, 30 },
        { 21, 2, 83 }
    };
    int principle = 0;
    int sec_principle = 0;
    for (int i = 0; i < arr.length; i++) {
      principle += arr[i][i];
    }

    // another diagonal
    for (int i = 0; i < arr.length; i++) {
      sec_principle += arr[i][arr[i].length - i - 1];
    }

    System.out.println("principle diagonal sum " + principle);
    System.out.println("second principle diagonal sum " + sec_principle);
  }
}

/**
 * principle diagonal sum 115
 * second principle diagonal sum 75
 */