import java.util.*;
public class D6_TowerOfHanoi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        toh(n, "A", "B", "C");
    }

    public static void toh(int n, String t1, String t2, String t3){
        if(n == 0) return;

        toh(n-1, t1, t3, t2);
        System.out.println(n + "[" + t1 + "->" + t2+"]");
        toh(n-1, t3, t2, t1);
    }
}
