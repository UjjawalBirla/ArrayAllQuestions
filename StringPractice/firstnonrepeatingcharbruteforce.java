package StringPractice;
public class firstnonrepeatingcharbruteforce {
    
    public static void main(String[] args) {
        String s="abbccddee";
       

        for(int i=0;i<s.length();i++)
        {
             boolean unique=true;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j) && i!=j)
                {
                    unique=false;
                    break;
                }
            }
            if(unique)
            {
                System.out.println(s.charAt(i));
                break;
            }
            else{
                System.out.println(-1);
                break;
            }
        }

         // TC==> O(n2);
        // SC==> O(1);
       
    }
}
