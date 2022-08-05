import java.util.Scanner;

public class odd {
    public static void main(String[]args){
        int a;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a%2!=0) {
            System.out.println("Odd");
        }
    }
}
