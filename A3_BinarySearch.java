package f1;
import java.util.*;

public class A3_BinarySearch {
    public static void main(String[] args){

        // input
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] arr = new int[sc.nextInt()];                 //
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }


        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // for(int val: arr){
        //     System.out.println(val);
        // }

        int key = sc.nextInt();

        // linear search
        for(int i = 0; i < arr.length; i++){    // for(int val: arr)
            if(key == arr[i]){
                System.out.println(i);
                break;                          //
            }
        }


    }
}
