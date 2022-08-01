import java.util.Scanner;

public class Plus {
    public static void main(String[]args){
        System.out.println("Enter a Number:");
        int c;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        c = a+b;
        System.out.println("Enter a Sum:"+c);
    }
}
