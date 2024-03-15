package f1;
public class A2_Rotate {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        // rotate : Approach 1 : O(n) time, uses extra space
        int i = arr.length-k;
        int j = 0;

        int[] newarr = new int[arr.length];
        while(i < arr.length){
            newarr[j] = arr[i];
            i++;
            j++;
        }

        i = 0;
        while(i < arr.length-k){
            newarr[j] = arr[i];
            i++;
            j++;
        }

        display(arr);



        // rotate : Approach 2 : O(n) time, O(1) space
        // prerequisite : reverse
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-k-1);

        reverse(arr, 0, arr.length-1);

        display(arr);
    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void display(int[] arr){
        for(int val: arr){
            System.out.print(val + " ");
        }

        System.out.println();
    }
}
