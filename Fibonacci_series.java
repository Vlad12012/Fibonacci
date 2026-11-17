import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        long n = scanner.nextLong();
        scanner.close();

        long first = 0, second = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.println(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
    }
}
