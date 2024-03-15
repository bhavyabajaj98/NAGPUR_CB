package f1;
public class A8_temp {
    public static void main(String[] args){
        String str = "abcd";

        for(int len = 1; len <= str.length(); len++){
            for(int i = 0, j = len; j <= str.length(); i++, j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
