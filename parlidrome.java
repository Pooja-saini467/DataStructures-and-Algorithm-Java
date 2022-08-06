import java.util.Scanner;

public class parlidrome {
    public static void main(String[]args){
        int num,sum=0,rem,par;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        par=num;
        while (num>0){
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        System.out.println("Enter the Sum:"+sum);
        if(par==sum){
            System.out.println("Number is Parlidrome.");
        }
        else{
            System.out.println("Number is not parlidrome.");
        }
    }
}
