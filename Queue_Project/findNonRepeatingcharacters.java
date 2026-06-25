package Queue_Project;

import java.util.LinkedList;
import java.util.Queue;

public class findNonRepeatingcharacters {

    public String nonRepeatChar(String s)
    {

        int[] freq=new int [26];
        Queue<Character> queue=new LinkedList<>();
        StringBuilder ans=new StringBuilder();

        for(char ch : s.toCharArray())
        {
            freq[ch - 'a']++;
            queue.offer(ch);

            while(!queue.isEmpty() && freq[queue.peek() - 'a']>1)
            {
                queue.poll();

                if(queue.isEmpty())
                {
                    ans.append('#');
                }
                else
                {
                    ans.append(queue.peek());
                }
            }
        }


        return ans.toString();

    }
    

    public static void main(String[] args) {
        findNonRepeatingcharacters obj =new findNonRepeatingcharacters();
        String s="abadbc";
        String result =obj.nonRepeatChar(s);
        System.out.println("Output : "+result);
    }
}
