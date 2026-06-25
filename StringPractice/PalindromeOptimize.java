package StringPractice;
public class PalindromeOptimize {
    
    public static void main(String[] args) {
        
        String s="madam";

        int l=0;
        int h=s.length()-1;;
        boolean pal=true;
        while(l<h)
        {
            if(s.charAt(l)!=s.charAt(h))
            {
                pal=false;
                break;
            }
            l++;
            h--;
        }
        System.out.print(pal);

         // TC==> O(n);
        // SC==> O(n);
    }
}
