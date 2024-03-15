package f1;
public class A6_temp {
    public static void main(String[] args){
        String s = "     the   sky is blue    ";

        s = s.trim();
        System.out.println(s);

        String[] arr = s.split("\s+");
        StringBuilder sb = new StringBuilder();
        for(String str: arr){
            sb.append(str + " ");
        }

        System.out.println(sb.toString());
    }
}
