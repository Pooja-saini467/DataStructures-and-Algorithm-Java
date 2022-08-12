import java.util.Scanner;

public class return_type {
    public static void main(String[]args){
       int ans = sum();
       System.out.println(+ans);
    }
    static int sum(){
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
    }
}
