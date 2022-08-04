import java.util.Scanner;

public class converter {
    public static void main(String[]args) {
        int a,b,c;
        System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        System.out.printf("Enter the value : %d",c);
    }
}
