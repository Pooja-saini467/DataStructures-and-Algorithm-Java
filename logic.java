import java.util.Scanner;

public class logic {
    public static void main(String[]args) {
        int a,b;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a==b && a>=b){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
