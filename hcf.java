import java.util.Scanner;

public class hcf {
    public static void main(String[]args){
        int a,b,rem;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for(a=1;a>b;){
            rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("HCF:"+b);
    }
}
