public class RecursiveMultiplication {
    public static int multiply(int a, int b) {
        // if the number is 0 then  the answer is 0 too
        if (b == 0) {
            return 0;
        }
        // if b > 0
        if (b > 0) {
            return a + multiply(a, b - 1); // for every time that b > 0 we add 'a' to answer
        }
        // if b < 0
        else {
            return -multiply(a, -b); // we will calculate the positive and make it negative
        }
    }
}
