import java.util.Scanner;

public class greatest {
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Enter the value of a:"+a);
        }
        else{
            if(b>a && b>c){
                System.out.println("Enter the Value of b:"+b);
            }
            else{
                System.out.println("Enter the value of c:"+c);
            }
        }
    }
}
