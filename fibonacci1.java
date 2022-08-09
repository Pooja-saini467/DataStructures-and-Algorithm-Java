import java.util.Scanner;

public class fibonacci1 {
    public static void main(String[]args){
        int a=0,b=1,c,count=1,num;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(count=1;count<=num;count++){
            System.out.println(""+a);
            c = a+b;
            a = b;
            b = c;
        }
    }
}
