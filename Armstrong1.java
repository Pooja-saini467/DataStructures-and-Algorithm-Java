import java.util.Scanner;

public class Armstrong1 {
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        int num,sum,rem,arm;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arm=num;
        for(sum=0;num>0;rem=num%10){
            rem = num%10;
            sum = sum+rem*rem*rem;
            num/=10;
        }
        System.out.println("Enter the Sum:"+sum);
        if(arm==sum){
            System.out.println("Number is armstrong.");
        }
        else{
            System.out.println("Number is not armstrong.");
        }
    }
}
