import java.util.Scanner;

public class reactangle {
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        int a,perimeter,area;
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        perimeter = 4*a;
        area = a*a;
        System.out.println("Perimeter and area of square:"+perimeter+","+area);
    }
}
