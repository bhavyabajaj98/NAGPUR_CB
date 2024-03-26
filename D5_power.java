import java.util.*;
public class D5_power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans = pow1(x, n);
        System.out.println(ans);
    }

    public static int pow1(int x, int n){
        if(n == 0) return 1;

        int ans = pow1(x, n-1);
        return ans*x;
    }

    public static int pow2(int x, int n){
        if(n == 0) return 1;

        int ans = pow2(x, n/2);
        if(n % 2 == 0){
            return ans*ans;
        }
        else{
            return ans*ans*x;
        }
    }
}