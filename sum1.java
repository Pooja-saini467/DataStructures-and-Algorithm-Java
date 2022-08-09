import java.util.Scanner;

public class sum1 {
    public static void main(String[]args){
        int a,b,sum=0,i;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        i=a;
        for(i=a;i<=b;i++){
            sum = sum + i;
        }
        System.out.println(+sum);
    }
}
