import java.util.Scanner;

public class circle {
    public static void main(String[]args) {
        System.out.println("Enter the Number:");
        int r,perimeter;
        float circumfrence,area;
        Scanner sc = new Scanner(System.in);
         r = sc.nextInt();
         perimeter = 4*r;
         circumfrence = (2*22*r)/7;
         area = (22*r*r)/7;
         System.out.println("Enter the value of perimeter,circumfrence and area:"+perimeter+","+circumfrence+","+area);
    }
}
