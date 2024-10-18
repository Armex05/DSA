public class AverageCalculator {
    public static double calculateAverage(int[] arr, int n) {
        // if it has no value, it should return the average of 0
        if (n == 0) {
            return 0;
        }

        // it adds the last element to the average of the rest of the array
        return (double) (arr[n - 1] + (n - 1) * calculateAverage(arr, n - 1)) / n;
    }
}
