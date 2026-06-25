package Stack_Project;
import java.util.Stack;
public class reverseStringusingStack {
    public static void main(String args[])
    {
        String s="ujjawal";
        Stack<Character> st=new Stack<>();
        
        for(char c: s.toCharArray())                         //  TC=O(n)
        {                                                    //  SC=O(n)
          st.push(c);
        }

        String rev="";

        while(!st.isEmpty())
        {
            rev+=st.pop();
        }
         
        System.out.print(rev);
    }
}
