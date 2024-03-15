package f1;
import java.util.*;
public class A9_StringBasics {
    public static void main(String[] args){
        // // declare : 
        // String str = "hello";
        // // char ch = "a";
        // String str2 = "world";

        // //Print : 
        // System.out.println(str + " " + str2);

        // // Input 
        // Scanner sc = new Scanner(System.in);
        // // String s3 = sc.next();
        // // String s4 = sc.next();
        // // System.out.println(s3);     // abc
        // // System.out.println(s4);     // def

        // String s5 = sc.nextLine();
        // String s6  =sc.nextLine();
        // System.out.println(s5);
        // System.out.println(s6);

        // String s1 = "hello";
        // System.out.println(s1.charAt(2));

        // for(int i = 0; i < s1.length(); i++){
        //     System.out.println(s1.charAt(i));
        // }

        // no function as set

        // String s1 = "hello";
        // System.out.print(s1.length());

        // System.out.println(s1.substring(0,1));
        // System.out.println(s1.substring(2,5));
        // System.out.println(s1.substring(2, 2));
        // // System.out.println(s1.substring(2, 1));
        // System.out.println(s1.substring(1));

        // for(int i = 0; i < s1.length(); i++){
        //     for(int j = i+1; j <= s1.length(); j++){
        //         System.out.println(s1.substring(i, j));
        //     }
        // }

        // Add strings
        // System.out.println("hello" + 10 + 2);
        // System.out.println("hello" + (10 + 20));
        // System.out.println("abc" + 10 + 20 + "hello");

        

        // int[] arr = new int[5];
        // System.out.println(arr.length);

        // char[] arr2 = new char[5];
        // System.out.println(arr2.length);
        
        // String[] arr3 = new String[5];
        // System.out.println(arr3.length);
        // arr3[1] = "abc";

        // System.out.println(arr3[1].length());       //3

        // split
        // String s = "my,name,is bhavya, bajaj";
        // String[] parts = s.split(",");

        

        // int[] arr = new int[5];
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // for(int val: arr){
        //     System.out.println(val);
        // }
        
        // loop
        // String s = "hello world";
        // for(int i = 0; i < s.length(); i++){
        //     System.out.println(s.charAt(i));
        // }

        // System.out.println("---------------");

        // for(char ch: s.toCharArray()){
        //     System.out.println(ch);
        // }

        // int i = 10;
        // int[] arr = new int[5];
        // arr[0] = 1;
        // fun(i, arr);

        // System.out.println(i);
        // System.out.println(arr[0]);

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");


        System.out.println(s1 == s2);       // true
        System.out.println(s1 == s3);       // false

        System.out.println(s1.equals(s2));       // true
        System.out.println(s1.equals(s3));       // true
        

    }

    public static void fun(int i, int[] arr){
        i = 20;
        arr[0] = 20;
    }
}
