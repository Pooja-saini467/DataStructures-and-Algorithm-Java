import java.util.Scanner;

public class lcm {
    public static void main(String[]args){
        int x,y,i;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        for(i=Math.max(x,y);i<=(x*y);i+=Math.max(x,y)){
            if(i%x==0 && i%y==0){
                System.out.println("LCM:"+i);
                break;
            }
        }
    }
}
