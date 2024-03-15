package f1;
import java.util.*;
public class B3_StringBasics {
    public static void main(String[] args){
        // declare
        // String s1 = "hello";
        // System.out.println(s1);

        // Scanner sc = new Scanner(System.in);
        // String s2 = sc.next();
        // String s3 = sc.next();
        // System.out.println(s2);
        // System.out.println(s3);

        // System.out.println(s1.charAt(0));
        // System.out.println(s1.charAt(3));
        // System.out.println(s1.charAt(5));

        // for(int i = 0; i < s1.length(); i++){
        //     System.out.println(s1.charAt(i));
        // }

        // setChar : no such thing

        // substring
        // String s1 = "hell ";
        // System.out.println(s1.substring(0, 5));     // "hello"
        // System.out.println(s1.substring(2));        // "llo"
        // System.out.println(s1.substring(4, 4));     // 
        // System.out.println(s1.substring(4, 3));
        // System.out.println(s1.substring(1, 6));

        // System.out.println(s1.substring(4));
        // System.out.print(s1.substring(4  ) + "yes");
        // System.out.println(s1.substring(6));

        // String s1 = "hello";
        // // System.out.println(s1.substring(3) + s1.substring(0, 2));

        // for(int i = 0; i < s1.length(); i++){
        //     for(int j = i+1; j <= s1.length(); j++){
        //         System.out.println(s1.substring(i, j));
        //     }
        // }

        // String s1 = "hello";
        // String s2 = " world";
        // String s3 = s1 + (10 + 20);
        // System.out.println(s3);

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int val: arr){
            System.out.println(val);
        }

        String s1 = "hello";
        for(int i = 0; i < s1.length(); i++){
            System.out.println(s1.charAt(i));
        }

        for(char ch: s1.toCharArray()){
            System.out.println(ch);
        }

    }
}
