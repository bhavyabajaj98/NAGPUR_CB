package f1;
import java.util.*;
public class A4_BS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];                 //
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        //binary search
        int i = 0;
        int j = arr.length-1;

        while(i <= j){
            int mid = (i+j)/2;

            if(arr[mid] == key){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] < key){
                i = mid+1;
            }
            else {
                j = mid-1;
            }
        }

         
    }
}
