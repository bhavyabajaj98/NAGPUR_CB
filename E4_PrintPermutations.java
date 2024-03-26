import java.util.*;
public class E4_PrintPermutations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printPermutations(str, "");
    }    

    public static void printPermutations(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
        }

        for(int i = 0; i < ques.length(); i++){
            char ch = ques.charAt(i);
            String ros = ques.substring(0, i) + ques.substring(i+1);

            printPermutations(ros, ans+ch);
        }
    }
}
