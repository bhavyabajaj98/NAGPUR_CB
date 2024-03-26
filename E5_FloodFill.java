import java.util.*;
public class E5_FloodFill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // int[][] arr = new int[n][m];
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[0].length; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // floodfill(arr, 0, 0, "");

        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        System.out.println(list.get(1));
    }    

    public class Node {
        Node next;
        int val;

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public static void floodfill(int[][] arr, int i, int j, String asf){
        if(i < 0 || j < 0 || i == arr.length || j == arr[0].length || arr[i][j] == 1 || arr[i][j] == 2){
            return;
        }
        if(i == arr.length-1 && j == arr[0].length-1){
            System.out.println(asf);
            return;
        }

        arr[i][j] = 2;
        floodfill(arr, i-1, j, asf+"t");
        floodfill(arr, i, j-1, asf+"l");
        floodfill(arr, i+1, j, asf+"d");
        floodfill(arr, i, j+1, asf+"r");
        arr[i][j] = 0;
    }
}
