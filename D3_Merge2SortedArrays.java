import java.util.*;
public class D3_Merge2SortedArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] arr2 = new int[m];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        mergeTwoSortedArrays(arr1, arr2);
    }

    public static void mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }


    }
    
}
