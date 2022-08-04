import java.util.Scanner;

public class area {
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        int a,l,w,A1,A2;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        l = sc.nextInt();
        w = sc.nextInt();
        A1 = a*a;
        A2 = l*w;
        if(A1==A2){
            System.out.println("Square is Reactangle.");
        }
        else{
            System.out.println("Square is not Reactangle.");
        }
    }
}
