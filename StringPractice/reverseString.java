package StringPractice;

public class reverseString {
    public static void main(String[] args) {
        String s="abba";
    boolean isPal =true;
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                isPal=false;
                break;
            }
            start++;
            end--;
        }
        if(isPal)
        {
            System.out.println("true");
        }
       else{
        System.out.println("false");
       }
       
    }
}
