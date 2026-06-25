

public class removedublictebruteforce {

    public static String removeDublicate(String s)
    {
        boolean changed=true;
        while(changed)
        {
            changed=false;
            StringBuilder sb=new StringBuilder();

            for(int i=0;i<s.length();i++)
            {
                if(i<s.length()-1 &&s.charAt(i)==s.charAt(i+1))
                {
                    i++;
                    changed=true;
                }
                else
                {
                    sb.append(s.charAt(i));
                }
            }
            s=sb.toString();
        }
        return s;
    }
    public static void main(String[] args) {
        
        String s="abbaca";
        System.out.println(removeDublicate(s));

    }

}
