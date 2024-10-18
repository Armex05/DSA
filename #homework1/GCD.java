public class GCD {
    public static int gcd(int a, int b) {
        // if the number is 0 then the gcd will be other one
        if (b == 0) {
            return a;
        }
        // هر بار باقی مانده بر یکی را حساب کرده و در تابع بازگشتی با دیگری عوض میکنیم
        return gcd(b, a % b);
    }
}
