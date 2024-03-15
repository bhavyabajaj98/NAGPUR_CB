package f1;
import java.util.*;

public class A4_reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // reverse : 
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            // swap

            i++;
            j--;
        }
    }
}
