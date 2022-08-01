import java.util.Scanner;

public class div {
    public static void main(String[]args){
        int a,b;
        float c;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a/b;
        System.out.println("Enter the div:"+c);
    }
}
