import java.util.*;
public class C2_ArrayList {
    public static void main(String[] args){
        // declare
        ArrayList<Integer> al = new ArrayList<>();

        // size
        System.out.println(al.size());
        
        // add      // O(1)
        al.add(1);
        al.add(2);
        al.add(3);

        System.out.println(al.size());

        al.add(1, 4);
        System.out.println(al);

        // get
        System.out.println(al.get(0));
        System.out.println(al.get(3));

        // set
        al.set(1, 5);
        System.out.println(al);

        // remove
        al.remove(1);
        System.out.println(al);

        //
        ArrayList<String> list = new ArrayList<>();
        list.add("abcdef");

        System.out.println(list.size());
        System.out.println(list.get(0).length());

    }
}
