import java.util.Scanner;

public class even {
    public static void main(String[]args) {
        int a;
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a%2==0){
            System.out.printf("Number is Even.");
        }
    }
}
