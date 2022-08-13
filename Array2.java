import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[]args){
        int[][] arr = new int[3][4];
        System.out.println("Enter the Values:");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j =0;j< arr.length;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
