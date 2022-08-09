import java.util.Scanner;

public class table1 {
    public static void main(String[]args){
        int i,a,b;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
         b = sc.nextInt();
        for(i=1;i<=10;i++){
            a = b*i;
            System.out.println(+b+"*"+i+"="+a);
        }
    }
}
