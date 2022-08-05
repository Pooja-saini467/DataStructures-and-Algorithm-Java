import java.util.Scanner;

public class triangle {
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        int a,b,c,h,perimeter;
        float area;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        h = sc.nextInt();
        perimeter = a+b+c;
        area = 1*b*h/2;
        System.out.println("Enter the perimeter:"+perimeter);
        System.out.println("Enter the area:"+area);
    }
}
