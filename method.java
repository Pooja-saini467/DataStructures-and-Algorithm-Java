import java.util.Scanner;

public class method {
    public static void main(String[]args){
        sum();
    }
    static void sum(){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(+sum);
    }
}
