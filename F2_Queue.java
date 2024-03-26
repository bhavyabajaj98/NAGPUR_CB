import java.util.*;
public class F2_Queue {
    public static void main(String[] args){

        //
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.size() + " -> " + queue);


        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.size() + " -> " + queue);

        System.out.println(queue.peek());

        int val = queue.remove();
        System.out.println(queue.size() + " -> " + queue);

        System.out.println(queue.remove());
        System.out.println(queue.size() + " -> " + queue);

        System.out.println(queue.remove());
        System.out.println(queue.size() + " -> " + queue);

        System.out.println(queue.remove());
        System.out.println(queue.size() + " -> " + queue);
        

    }    
}
