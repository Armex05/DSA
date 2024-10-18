public class MaxInArray {
    public static int findMax(int[] arr, int n) {
        // if we only have one element we will return that
        if (n == 1) {
            return arr[0];
        }

        // we will calculate recursive for all elements except last one
        int maxOfRest = findMax(arr, n - 1);

        // then we will compare it to the last element
        return Math.max(arr[n - 1], maxOfRest);
    }
}
