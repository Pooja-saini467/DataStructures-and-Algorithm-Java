import java.util.Scanner;

public class increment {
    public static void main(String[]args) {
        int a,b,c;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = a++;
        c= ++a;
        System.out.println("Enter the Value:"+b+","+c);
    }
}
