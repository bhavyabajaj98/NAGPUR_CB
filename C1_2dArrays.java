import java.util.*;


public class C1_2dArrays {
    public static void main(String[] args){
        int[][] arr = new int[3][4];

        arr[1][2] = 10;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("-------------------");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.println(arr[i][j]);
            }
        }

        
    }
}
