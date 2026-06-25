package Stack_Project;

import java.util.Stack;

public class decodeString {

    public static String decodeString(String s)
    {  
        Stack<Integer> countstack=new Stack<>();
        Stack<StringBuilder> stringstack=new Stack<>();
        StringBuilder current=new StringBuilder();
        int num=0;

        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                num=num*10+(ch-'0');
            }
            else if(ch=='[')
            {
                countstack.push(num);
                stringstack.push(current);
                current=new StringBuilder();
                num=0;
            }
            else if(ch==']')
            {
                int repeat=countstack.pop();
                StringBuilder prev=stringstack.pop();

                for(int i=0;i<repeat;i++)
                {
                    prev.append(current);
                }
                current = prev;
            }
            else
            {
                current.append(ch);
            }
            
        }
        return current.toString();
        
    }


    public static void main(String[] args) {
        String s="3[a]2[bc]";
        System.out.println();
        System.out.println(decodeString(s));
        System.out.println();
    }
    
}
