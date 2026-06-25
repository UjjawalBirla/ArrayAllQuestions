package Stack_Project;

import java.util.Stack;

public class checkperantheses {
    
    public static void main(String[] args) {
        
        String s="{[()]}";
        int n=s.length();
        boolean iscorrect=true;;                                    // TC = O(n)
        if(n%2!=0)                                                  // SC = O(n)
        {            
            iscorrect=false;
        }

        Stack<Character> stack=new Stack<>();                     //  Stack<Character> st=new Stack<>();

        for(int i=0;i<n;i++)                                      // for(char c : s.tocharSArray()){
        {                                                         // if(ch=='{'  || ch=='['  || ch=='('){
           char ch=s.charAt(i);                                   //  st.push(c);}
            if(ch=='{'  || ch=='['  || ch=='(')                   //else{
            {                                                     //     if(st.isEmpty())  iscorrect=false; break;}
                 stack.push(ch);                                  //    char top =st.pop() 
            }                                                     //     if((c==')' && top != '(') || c == "}" " ] "&& to != "}" " ]" )                                                     
            else                                                  //     iscorrect= false; break;}
            {                                                     //      }}
                if(stack.isEmpty())                               //  if(st.isEmpty())  iscorrect=false;
                {                                                 //   print iscorrect;
                    iscorrect=false;
                    break;
                }

                char top=stack.peek();
                if(ch==')' && top!='(')
                {
                    iscorrect=false;
                    break;
                }
                else if(ch==']' && top!='[')
                {
                    iscorrect=false;
                    break;
                }
                else if(ch=='}'  && top!='{')
                {
                    iscorrect=false;
                    break;
                }
                else
                {
                    stack.pop();
                }
            }
        }

      
            System.out.println(iscorrect && stack.isEmpty());
    }
}
