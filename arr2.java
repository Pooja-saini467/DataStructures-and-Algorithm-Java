import java.util.Arrays;
import java.util.Scanner;

public class arr2 {
    public static void main(String[]args){
        String[] arr = new String[4];
        System.out.print("Enter the Values:");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
        arr[2] = "ppooojaaa";
        System.out.println(Arrays.toString(arr));
    }
}
