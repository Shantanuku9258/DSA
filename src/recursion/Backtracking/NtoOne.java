package recursion.Backtracking;

import java.util.Scanner;

public class NtoOne {
    static void printN(int i,int n){
        if(i>n){
            return;
        }
        printN(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
        printN(1,n);
    }
}
