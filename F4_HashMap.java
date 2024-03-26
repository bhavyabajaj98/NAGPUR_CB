import java.util.*;
public class F4_HashMap {
    public static void main(String[] args) {
        // HashMap<String, Integer> map = new HashMap<>();

        // map.put("India", 140);
        // map.put("China", 200);
        // map.put("US", 50);
        // map.put("UK", 30);

        // int val = map.get("India");
        // System.out.println(val);

        // Integer val1 = map.get("Australia");
        // System.out.println(val1);

        // boolean flag = map.containsKey("India");
        // System.out.println(flag);

        // System.out.println(map);

        // map.put("India", 100);
        // System.out.println(map);

        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0, 5);
        // map.put(5, 0);
        // map.put(10, 10);
        // map.put(0, 6);

        // System.out.println(map);

        // for(int key: map.keySet()){
        //     int val = map.get(key);
        //     System.out.println(key + " -> " + val);
        // }

        String str = "cbaaccbaccbaca";

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                int of = map.get(ch);
                map.put(ch, of+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        char ans = str.charAt(0);
        for(char ch: map.keySet()){
            if(map.get(ch) > map.get(ans)){
                ans = ch;
            }
        }
        System.out.println(ans);
    }
}
