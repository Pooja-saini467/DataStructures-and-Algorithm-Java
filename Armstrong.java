import java.util.Scanner;

public class Armstrong {
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        int num,rem,arm,sum;
        sum=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        arm=num;
        while(num>0){
            rem = num%10;
            sum = rem*rem*rem+sum;
            num/=10;
        }
        System.out.println("Enter the sum:"+sum);
        if(sum==arm){
            System.out.println("Number is armstrong.");
        }
        else{
            System.out.println("Number is not armstrong.");
        }
    }
}
