package recursion.Backtracking;


public class OnetoN {
    public static void print(int i){
        if(i==0){
             return;
        }

        print(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n =5;
        print(n);
    }
}

