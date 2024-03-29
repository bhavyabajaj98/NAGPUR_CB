import java.util.*;
public class F1_BalancedBrakets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean flag = balancedOrNot(str);
        System.out.println(flag);
    }

    public static boolean balancedOrNot(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.size() == 0){
                    return false;
                }

                if(isComplimentary(ch, stack.peek())){
                    stack.pop();
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                continue;
            }
        }

        if(stack.size() > 0){
            return false;
        }

        return true;
    }

    public static boolean isComplimentary(char ch1, char ch2){
        if(ch1 == ')' && ch2 == '('){
            return true;
        }
        else if(ch1 == ']' && ch2 == '['){
            return true;
        }
        else if(ch1 == '}' && ch2 == '{'){
            return true;
        }

        return false;
    }
}
