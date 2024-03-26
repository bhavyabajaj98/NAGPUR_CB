import java.util.*;
public class E6_PrintSubsequences {
    public static void main(String[] args){
        

        printSubsequences("abc", "");
    }    

    public static void printSubsequences(String ques, String ans){
        //
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String ros = ques.substring(1);

        printSubsequences(ros, ans + "-");
        printSubsequences(ros, ans + ch);
        

    }
}
