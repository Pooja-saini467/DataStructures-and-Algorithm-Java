import java.util.Scanner;

public class square {
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        int l,w,perimeter,area;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        w = sc.nextInt();
        perimeter = 2*(l+w);
        area = l*w;
        System.out.println("Perimeter and area of the reactangle:"+perimeter+","+area);
    }
}
