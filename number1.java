//import java.util.Scanner;

//public class number1 {
 //   public static void main(String[]args){
 //       System.out.println("Enter the Number:");
  //      int a,b,i;
  //      Scanner sc = new Scanner(System.in);
  //      a = sc.nextInt();
  //      b = sc.nextInt();
  //      i = a;
  //      while(i<=b){
  //          System.out.println(+i);
  //          i++;
  //      }
  //  }
//}

import java.util.Scanner;

public class number1 {
    public static void main(String[]args){
        System.out.println("Enter the Number:");
        int a,b,i;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for(i=a;i<=b;i++){
            System.out.println(+i);
        }
    }
}