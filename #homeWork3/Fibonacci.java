import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position of Fibonacci number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        if (n == 1 || n == 2) {
            System.out.println("Fibonacci number at position " + n + " is 1.");
            return;
        }

        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Fibonacci number at position " + n + " is " + fib[n - 1] + ".");
        scanner.close();
    }
}
