import java.util.*;
public class E3_PrintSubsequences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printSubsequences(str, "");
    }

    public static void printSubsequences(String ques, String ans){
        //
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSubsequences(roq, ans+"");
        printSubsequences(roq, ans+ch);


    }
}
