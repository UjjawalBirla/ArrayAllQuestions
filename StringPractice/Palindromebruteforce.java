package StringPractice;
import java.lang.classfile.instruction.StoreInstruction;

public class Palindromebruteforce {
    
    public static void main(String[] args) {
        
        String s="madam";
        String rev="";
        
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        System.out.println(s.equals(rev));

         // TC==> O(n2);
        // SC==> O(n);
    }
}
