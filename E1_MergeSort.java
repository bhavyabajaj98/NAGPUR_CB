import java.util.*;
public class E1_MergeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //
        int[] ans = mergeSort(arr, 0, arr.length-1);
        display(ans);
    }    

    public static void display(int[] arr){
        for(int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int[] mergeSort(int[] arr, int i, int j){
        //
        if(i == j){
            int[] barr = new int[1];
            barr[0] = arr[i];
            return barr;
        }


        int mid = (i+j)/2;
        int[] larr = mergeSort(arr, i, mid);
        int[] rarr = mergeSort(arr, mid+1, j);

        int[] ans = mergeTwoSortedArrays(larr, rarr);
        return ans;
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[arr1.length+arr2.length];

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }
            else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length){
            ans[k] = arr1[i];
            k++;
            i++;
        }
        while(j < arr2.length){
            ans[k] = arr2[j];
            k++;
            j++;
        }

        return ans;
    }
}
