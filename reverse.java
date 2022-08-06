import java.util.Scanner;

public class reverse {
    public static void main(String[]args){
        int num,sum=0,rem;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num>0){
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        System.out.println("Enter the Sum:"+sum);
    }
}
