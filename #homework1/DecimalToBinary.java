public class DecimalToBinary {
    public static void printBinary(int n) {
        // if n == 0 we will return
        if (n == 0) {
            return;
        }

        // like the formula of calculating binary we first go till the end then write the
        // numbers we got from the divisions
        printBinary(n / 2);

        // baghimande ro bedast miarim = n % 2

        System.out.print(n % 2);
    }
}
