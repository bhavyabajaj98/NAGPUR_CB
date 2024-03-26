import java.util.*;
public class D7_ALBasics {
    public static void main(String[] args){
        // ArrayList<Integer> al = new ArrayList<>();
        // System.out.println(al.size());

        // al.add(1);
        // al.add(2);
        // al.add(3);
        // System.out.println(al + " " + al.size());

        // // // get
        // System.out.println(al.get(2));

        // // // set
        // al.set(1, 5);
        // // al[1] = 5;

        // System.out.println(al + " " + al.size());

        // al.add(4);
        // System.out.println(al + " " + al.size());

        // al.add(1, 10);
        // System.out.println(al + " " + al.size());

        // al.remove(1);
        // al.remove(1);
        // System.out.println(al + " " + al.size());

        int[] arr = {2, 3, 2, 2, 1};
        int key = 2;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                al.add(i);
            }
        }

        System.out.println(al + " " + al.size());


    }    
}
