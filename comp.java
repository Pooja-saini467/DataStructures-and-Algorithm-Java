import java.util.Scanner;

public class comp {
    public static void main(String[]args) {
        int a,b,c;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         b = sc.nextInt();
         c = b;
         b = a;
         a = c;
         System.out.println(+a+","+b);
    }
}
