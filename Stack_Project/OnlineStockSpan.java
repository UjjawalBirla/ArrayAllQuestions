package Stack_Project;

import java.util.Stack;

public class OnlineStockSpan {
    
    Stack<int[]> stack;
    public OnlineStockSpan()
    {
        stack=new Stack<>();
    }

    public int next(int price)
    {
        int ans=1;

        while(!stack.isEmpty() && stack.peek()[0] <= price)
        {
            ans+=stack.pop()[1];

        }
        stack.push(new int[]{price , ans});

        return ans;
    }



    public static void main(String[] args) {
        
        OnlineStockSpan sp=new OnlineStockSpan();

        System.out.println(sp.next(100));
        System.out.println(sp.next(80));

        System.out.println(sp.next(60));

        System.out.println(sp.next(70));

        System.out.println(sp.next(60));

        System.out.println(sp.next(75));

        System.out.println(sp.next(85));

    }
    
}
