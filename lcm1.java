import java.util.Scanner;

public class lcm1 {
    public static void main(String[]args){
        int a,b,i;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        i=a>b?a:b;
        while (true){
            if(i%a==0&&i%b==0){
                System.out.println("Lcm:"+i);
                break;
            }
            i++;
        }
    }
}
