import java.util.*;
public class D9_StringBasics {
    public static void main(String[] args){
        // String str = "hello";

        // System.out.println(str.length());

        // System.out.println(str.charAt(2));

        // System.out.println(str.substring(2));

        // str += 'c';
        // System.out.println(str);

        ArrayList<String> ans = getSubsequences("abc");
        // System.out.println(ans);
        for(String str: ans){
            System.out.println(str);
        }
    }

    public static ArrayList<String> getSubsequences(String str){
        //
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getSubsequences(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String s: rres){
            mres.add("-" + s);
        }
        for(String s: rres){
            mres.add(ch + s);
        }
        return mres;
    }
}
