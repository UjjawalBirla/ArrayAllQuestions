package Stack_Project;

import java.util.Stack;

public class pop {

    public static void main(String[] args) {
        
         Stack<Integer> stack=new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(90);
        stack.push(100);
        System.out.println("Before the pop");
        System.out.println(stack);
       System.out.println("top of stack ----> "+ stack.pop());
         System.out.println("After the pop");
        System.out.println(stack);
         
    }
    
}
