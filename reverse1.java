import java.util.Scanner;

public class reverse1 {
    public static void main(String[]args){
        int num,sum,rem;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(sum=0;num>0;){
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        System.out.println("Enter the reverse number:"+sum);
    }
}
