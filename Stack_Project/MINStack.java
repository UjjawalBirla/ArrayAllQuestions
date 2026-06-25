package Stack_Project;

import java.util.Stack;

public class MINStack {
     Stack<Integer> st;
     Stack<Integer> minst;
    public MINStack()
    {
        st=new Stack<>();
        minst=new Stack<>();
    }

    public void push(int val)
    {
        st.push(val);
        if(minst.isEmpty() || val<=minst.peek())
        {
            minst.push(val);
        }
      
    }

    public void pop()
    {
        if(st.peek().equals(minst.peek()))
        {
            minst.pop();
        }
        st.pop();
    }

    public int top()
    {
       return  st.peek();
    }

    public int minStack()
    {
        return minst.peek();
    }

    public static void main(String[] args) {

        MINStack ms=new MINStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.println(ms.minStack());
        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.minStack());

        
    }
    
}
