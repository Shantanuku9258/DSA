package recursion;

public class print {
    public static void printNumbers(int n) {
        if (n > 6) {
            return; // Base condition to stop recursion
        }
        System.out.println(n); // Print current number
        printNumbers(n + 1);   // Recursive call
    }

    public static void main(String[] args) {
        printNumbers(1); // Start from 1
    }
}
