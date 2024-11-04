import java.util.Scanner;

public class Factorial {
    public static BigNumber fact(int n) {
        BigNumber result = new BigNumber();
        for (int i = 2; i <= n; i++) {
            result.multiply(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number n: ");
        int n = scanner.nextInt();

        if (n < 0 || n > 100) {
            System.out.println("The number must be between 1 and 100.");
        } else {
            BigNumber result = fact(n);
            System.out.print("The factorial of the number " + n + " is: ");
            result.print();
        }
        scanner.close();
    }
}