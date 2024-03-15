package f1;
import java.util.*;
public class B1_palindrome {
    public static void main(String[] args){
        String s1 = "kanak";
        String s2 = "abccca";

        if(isPalindrome(s1) == true){
            System.out.println(s1 + " yes");
        }
        else{
            System.out.println(s1 + " no");
        }

        if(isPalindrome(s2)){
            System.out.println(s2 + " yes");
        }
        else{
            System.out.println(s2 + " no");
        }
    }

    public static boolean isPalindrome(String s1){
        boolean flag = true;

        int i = 0;
        int j = s1.length()-1;
        while(i < j){
            char ch1 = s1.charAt(i);
            char ch2 = s1.charAt(j);
            
            if(ch1 == ch2){
                i++;
                j--;
                continue;
            }
            else{
                i++;
                j--;
                return false;
            }

            
        }

        return true;
    }
    
}
