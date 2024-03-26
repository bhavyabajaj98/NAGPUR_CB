import java.util.*;
public class D1_HourGlass {
    public static void main(String[] args){
        int arr[][] =new int[6][6];
        int arr1[][]=new int[6][6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=0; j<6;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

        int max=Integer.MIN_VALUE;
        for(int i=1;i<5;i++){
            for (int j=1;j<5;j++){
                max = Math.max(max,arr[i][j]+arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1]);

            }
        }
        
       
       System.out.println(max);
        

    }
}
