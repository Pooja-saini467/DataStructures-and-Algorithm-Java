import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[]args){
        String[] str = new String[5];
        System.out.println("Enter the values:");
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<str.length;i++){
            str[i] = sc.next();
        }
        nums(str);
        System.out.println(Arrays.toString(str));
    }
    static void nums(String[]arr){
        arr[0] = "pooja";
    }
}
