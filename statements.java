import java.util.Scanner;

public class statements {
    public static void main(String[]args){
        System.out.println("Enter the Value:");
        Scanner sc = new Scanner(System.in);
        String w  = sc.nextLine();
        switch (w){
            case("Apple"):
                System.out.println("Red Fruit");
                break;
            case("Mango"):
                System.out.println("King of Fruit");
                break;
            case("Orange"):
                System.out.println("tasty fruit");
                break;
            default:
                System.out.println("Chhiku");
        }
    }
}