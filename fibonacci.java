import java.util.Scanner;

public class fibonacci {
    public static void main(String[]args){
        int a=0,b=1,num,count=1,c;
        System.out.println("Enter the Number of terms:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(count<=num){
            System.out.println(""+a);
            c=a+b;
            a=b;
            b=c;
            count++;
        }
    }
}
