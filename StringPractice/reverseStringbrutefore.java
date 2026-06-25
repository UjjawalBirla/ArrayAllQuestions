package StringPractice;
import javax.sound.sampled.SourceDataLine;

public class reverseStringbrutefore {
    
    public static void main(String[] args) {
        {
             String s="Ujjawal";
             
             //String rev="";

        //      for(int i=s.length()-1;i>=0;i--)
        //      {
        //         rev+=s.charAt(i);
        //      }
        //       System.out.println(rev);

         // TC==> O(n2);
        // SC==> O(1);
        

            StringBuilder  sb=new StringBuilder(s);
            System.out.println(sb.reverse().toString());
       
         }

          // TC==> O(n);
          // SC==> O(n); 
    }
}
