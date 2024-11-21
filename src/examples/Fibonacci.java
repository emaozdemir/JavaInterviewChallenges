package examples;

public class Fibonacci {
    // Fibonacci dizisini hem iteratif hem de rekürsif olarak yazdırın.
    public static int fibonacciIterative(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return n <= 1 ? n : b;
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Iterative (10): " + fibonacciIterative(n));
        System.out.println("Fibonacci Recursive (10): " + fibonacciRecursive(n));
    }
}
