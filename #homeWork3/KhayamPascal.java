import java.util.Scanner;

public class KhayamPascal {
    public static void KhayamPascal(int n) {
        for (int line = 0; line < n; line++) {
            int value = 1;
            for (int i = 0; i <= line; i++) {
                System.out.print(value + " ");
                value = value * (line - i) / (i + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        KhayamPascal(n);
        scanner.close();
    }
}
