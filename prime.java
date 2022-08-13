import java.util.Scanner;

public class prime {
    public static void main(String[]args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n) {
        if(n<=1){
            return false;
        }
        int c =2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        return false;
    }
}
