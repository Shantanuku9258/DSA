package recursion;

public class Fibonacci {

    // Recursive function to find nth recursion.Fibonacci number
    public static int fib(int n) {
        if (n == 0) {
            return 0;  // Base case
        }
        if (n == 1) {
            return 1;  // Base case
        }
        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 8;  // Example input
        System.out.println("recursion.Fibonacci number at position " + n + " is: " + fib(n));
    }
}
