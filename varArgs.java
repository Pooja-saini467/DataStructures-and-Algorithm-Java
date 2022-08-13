
import java.util.Arrays;

public class varArgs {
    public static void main(String[]args){
        fun(2,5,6,8,9,99,90);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
