import java.util.Scanner;

public class assign {
    public static void main(String[]args){
        int a,b;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        a+=b;
        System.out.println("Enter the Value:"+a);
    }
}
