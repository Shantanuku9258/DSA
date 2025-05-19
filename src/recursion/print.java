package recursion;

public class print {
    int cnt =1;
    public void printno(int n){
        if(cnt>3) return;
        System.out.println(cnt);
        cnt++;
        printno(n);
    }
    public static void main(String[] args) {
        print p =new print();
        p.printno(3);
    }
}
