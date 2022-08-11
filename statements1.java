import java.util.Scanner;

public class statements1 {
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case(1) -> System.out.println("Pooja");
            case(5) -> System.out.println("Amit");
            default -> System.out.println("Puppy");
        }
    }
}
