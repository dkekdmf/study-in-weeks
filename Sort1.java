import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int []arr = new int[total];
        for(int i=0;i<arr.length;i++){
            int number = sc.nextInt();
            arr[i]  = number;
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
       Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i+" ");
        }



    }
}
