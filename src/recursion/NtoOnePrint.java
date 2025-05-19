package recursion;

import java.util.Scanner;

public class NtoOnePrint{
    public void printNumbers(int n) {
        if (n < 1) return;       // Base case
        System.out.println(n);   // Print current number
        printNumbers(n - 1);     // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        NtoOnePrint obj = new NtoOnePrint();
        obj.printNumbers(n);
    }
}
