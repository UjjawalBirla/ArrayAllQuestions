package StringPractice;
public class firstnonrepeatingcharoptimize {
    public static void main(String[] args) {
        
        String s="aabbcddee";
        int[] freq=new int[26];

        
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;

        }
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']==1)
            {
                System.out.println(s.charAt(i));
                break;
            }
        }
        

         // TC==> O(n);
        // SC==> O(1); &  O(n) HashMap;
       
    }
}
