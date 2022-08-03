import java.util.Scanner;
public class mod {
    public static void main(String[]args){
        int a,b,c;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a % b;
        System.out.println("Enter the reminder:"+c);
    }
}
