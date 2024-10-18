public class ReverseArray{
    public static void reverseArray(int[] arr, int start, int end) {
        // the func first checks if the starter and last number aren't equal or less
        if (start >= end) {
            return;
        }

        // changing the elements using an addition int called temp
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // continue for the rest ...
        reverseArray(arr, start + 1, end - 1);
    }
}
