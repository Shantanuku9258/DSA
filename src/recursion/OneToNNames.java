package recursion;

import java.util.Scanner;

public class OneToNNames {
    public void printNames(int cnt, int n) {
        if (cnt > n) return;
        System.out.println(cnt + ". shantanu");  // Now also printing count
        printNames(cnt + 1, n);                  // Recursive call with updated count
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times to print your name: ");
        int n = sc.nextInt();

        OneToNNames p = new OneToNNames();
        p.printNames(1, n);  // Start counting from 1
    }
}
