import java.util.*;
public class E8_Stacks {
    public static void main(String[] args){
        // declare 
        Stack<Integer> stack = new Stack<>();
        
        System.out.println(stack.size() + " -> " + stack);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.size() + " -> " + stack);

        stack.push(40);
        System.out.println(stack.size() + " -> " + stack);



        int val = stack.peek();
        System.out.println(val);

        System.out.println(stack.size() + " -> " + stack);

        val = stack.pop();
        System.out.println(val);

        System.out.println(stack.size() + " -> " + stack);


        val = stack.pop();
        System.out.println(val);

        val = stack.pop();
        System.out.println(val);

        val = stack.pop();
        System.out.println(val);

        System.out.println(stack.size() + " -> " + stack);

        val = stack.peek();
        System.out.println(val);
    }
}
