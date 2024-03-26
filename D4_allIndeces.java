import java.util.*;
public class D4_allIndeces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        // 
        int[] ans = func(arr, 0, key, 0);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }   
    
    public static int[] func(int[] arr, int idx, int key, int fsf){
        if(idx == arr.length){
            int[] ans = new int[fsf];
            return ans;
        }


        //Faith:
        if(arr[idx] == key){
            int[] ans = func(arr, idx+1, key, fsf+1);
            ans[fsf] = idx;
            return ans;
        }
        else{
            int[] ans = func(arr, idx+1, key, fsf);
            return ans;
        }
        
    }
}
