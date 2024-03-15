package f1;
public class A7_temp {
    public static void main(String[] args){
        String str = "cbaeicde";

        int count = 0;
        int ans = 0;
        for(char ch: str.toCharArray()){
            if(isVowel(ch) == true){
                count++;
                ans = Math.max(ans, count);
            }
            else{
                count = 0;
            }
        }

        System.out.println(ans);

        String s = "6567689791";
		int n = Integer.parseInt(s);
		long l = Long.parseLong(s);
		System.out.println(n);
		System.out.println(l);
    } 
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}
