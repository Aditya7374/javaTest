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