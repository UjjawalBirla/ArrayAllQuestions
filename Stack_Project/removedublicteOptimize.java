package Stack_Project;

import java.util.Stack;

public class removedublicteOptimize {

    public static String removeDublicate1(String s)
    {
          Stack<Character> stack=new Stack<>();                      // StringBuilder sb  = new StringBuilder();
           for(char ch : s.toCharArray())                              // for(char ch : s.toCharArray())
             {                                                       // {
                  if(!stack.isEmpty() && stack.peek() == ch) //     if(sb.length() > 0 && sb.charAt(sb.length()-1)==ch)
                {                                                   //     {
                  stack.pop();                                      //         sb.deleteCharAt(sb.length()-1);

                }                                                   //     }
                 else                                                //     else
                 {                                                  //     {
                     stack.push(ch);                                     //         sb.append(ch);
                 }                                                     //     }
            }                                                          // }
                                                                      // return sb.toString();
          StringBuilder result=new StringBuilder();

          for(char ch :  stack)
          {
            result.append(ch);
          }
          return result.toString();
    }
    
    public static void main(String[] args) {
        
            String s="abbaccalal";

            System.out.println(removeDublicate1(s));

    }
    
}
