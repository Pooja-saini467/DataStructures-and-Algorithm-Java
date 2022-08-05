import java.util.Scanner;

public class Decrement {
    public static void main(String[]args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        a = sc.nextInt();
        b = a--;
        c = --a;
        System.out.println("Enter the value:"+b+","+c);
    }
}
