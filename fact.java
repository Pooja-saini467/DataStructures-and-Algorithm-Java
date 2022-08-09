import java.util.Scanner;

public class fact {
    public static void main(String[]args){
        int fact=1,i=1,num;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println(+fact);
    }
}
