import java.util.Scanner;

public class triangle1 {
    public static void main(String[]args){
        int a,Perimeter;
        double Area;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        Perimeter = 3*a;
        Area = (1.732*a*a)/4;
        System.out.println("Enter the Value of Perimeter and Area:"+Perimeter+","+Area);
    }
}
