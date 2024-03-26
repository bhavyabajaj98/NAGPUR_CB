import java.util.*;
public class D2_FO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        //
        int ans = firstOccurence(arr, 0, key);
        System.out.println(ans);
    }

    public static int firstOccurence(int[] arr, int i, int key){
        //
        if(i == arr.length) return -1;

        if(arr[i] == key){
            return i;
        }
        int ans = firstOccurence(arr, i+1, key);
        
        
        return ans;
    }
}
