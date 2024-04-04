/*
Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

*/

public static void mergeArrays(int[] X, int m, int[] Y, int n) {
    int i = m - 1;

    int j = n - 1;
  while (i >= 0 && j >= 0) {
        if (Y[j] > X[i]) {
      X[i + 1] = Y[j];
      j--;
    } else {
            X[i + 1] = X[i];
      i--;
    }
  }

   while (j >= 0) {
    X[i + 1] = Y[j];
    j--;
    i--;
  }
}