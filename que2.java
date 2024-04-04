public class MaximumSumPath {

    public static int findMaxSumPath(int[] X, int[] Y) {
        int result = 0;
        int sum1 = 0, sum2 = 0;
        int i = 0, j = 0; 

        while (i < X.length && j < Y.length) {
            if (X[i] < Y[j]) {
                sum1 += X[i++];
            } else if (X[i] > Y[j]) {
                sum2 += Y[j++];
            } else { 
                result = Math.max(result, sum1 + sum2 + X[i]);
                sum1 = sum2 = 0;
                i++;
                j++;
            }
        }

        result += Math.max(sum1 + sum2, sum1 + sum(Y, j)); 

        return result;
    }

    private static int sum(int[] arr, int start) {
        int sum = 0;
        for (int i = start; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        int maxSumPath = findMaxSumPath(X, Y);
        System.out.println("Maximum sum path: " + maxSumPath);
    }
}