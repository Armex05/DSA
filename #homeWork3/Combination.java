import java.util.Scanner;

public class Combination {
    public static int combination(int n, int r) {
        if (r > n - r) {
            r = n - r; // Take advantage of symmetry
        }
        int C = 1;
        for (int i = 0; i < r; i++) {
            C *= (n - i);
            C /= (i + 1);
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println("C(" + n + ", " + r + ") = " + combination(n, r));
        scanner.close();
    }
}
