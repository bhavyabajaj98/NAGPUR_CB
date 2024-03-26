import java.util.*;
public class E2_GetSubsequences {
    public static void main(String[] args){

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
            // bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getSubsequences(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(int i = 0; i < rres.size(); i++){
            mres.add("-" + rres.get(i));
        }
        for(int i = 0; i < rres.size(); i++){
            mres.add(ch + rres.get(i));
        }

        return mres;
    }
}
