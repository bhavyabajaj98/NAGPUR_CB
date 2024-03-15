package f1;
import java.util.*;
import java.io.*;

public class A5_Rotate {
    public static void main(String[] args){
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        // rotate;
        // int[] narr = new int[arr.length];
        // int i = arr.length-k;
        // int j = 0;

        // while(i < arr.length){
        //     narr[j] = arr[i];
        //     i++;
        //     j++;
        // }

        // i = 0;
        // while(i < arr.length-k){
        //     narr[j] = arr[i];
        //     i++;
        //     j++;
        // }



        // for(int val: narr){
        //     System.out.print(val + " ");
        // }
        // System.out.println("yes");


        // rotate : O(n), O(1)
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, 0, arr.length-1);

        for(int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
