import java.util.*;
public class F3_PriorityQueue {
    public static void main(String[] args){
        // declare
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // System.out.println(pq.size() + " -> " + pq);

        // pq.add(50);
        // pq.add(15);
        // pq.add(25);

        // System.out.println(pq.peek());
        // System.out.println(pq.size() + " -> " + pq);


        // pq.add(21);
        // pq.add(20);

        // System.out.println(pq.peek());
        // System.out.println(pq.size() + " -> " + pq);

        // System.out.println(pq.remove());
        // System.out.println(pq.size() + " -> " + pq);


        // pq.add(2);

        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());

        // System.out.println(pq.size() + " -> " + pq);

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // //
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val: arr){
            pq.add(val);
        }

        for(int i = 0; i < k; i++){
            System.out.println(pq.remove());
        }
    }    
}
