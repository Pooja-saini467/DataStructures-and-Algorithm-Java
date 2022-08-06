import java.util.Scanner;

public class parlidrome1 {
    public static void main(String[]args){
        int num,sum,rem,par;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        par=num;
        for(sum=0;num>0;){
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        System.out.println("Enter the Sum:"+sum);
        if(par==sum){
            System.out.println("Number is parlidrome.");
        }
        else{
            System.out.println("Number is not parlidrome.");
        }
    }
}
