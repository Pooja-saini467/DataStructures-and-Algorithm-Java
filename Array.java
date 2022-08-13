import java.util.Scanner;

public class Array {
    public static void main(String[]args){
       int[] arr = new int[4];
        System.out.println("Enter the Values:");
        Scanner sc = new Scanner(System.in);
       for(int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }
    }
}
