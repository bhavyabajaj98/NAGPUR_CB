import java.util.*;
public class E9_DuplicateBrackets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean flag = checkDuplicacy(str);
        System.out.println(flag);
    }

    public static boolean checkDuplicacy(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                if(stack.size() > 0 && stack.peek() == '('){
                    return true;
                }

                while(stack.size() > 0 && stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        return false;
    }
}
