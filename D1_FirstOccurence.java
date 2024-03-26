import java.util.*;
public class D1_FirstOccurence {
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
        // System.out.println(ans);

        System.out.println(lastOccurence(arr, 0, key));
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

    // arr, 0, 2
    public static int lastOccurence(int[] arr, int i, int key){
        //
        if(i == arr.length) return -1;

        int ans = lastOccurence(arr, i+1, key);
        if(ans != -1){
            return ans;
        }
        else if(arr[i] == key){
            return i;
        }
        else{
            return -1;
        }
    }


}
