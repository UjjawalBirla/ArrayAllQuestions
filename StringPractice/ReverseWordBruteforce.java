package StringPractice;
import java.*;
public class ReverseWordBruteforce {
 
    public static void main(String[] args)
    {
        String s=" the sky is blue";
        String[] arr=s.trim().split("\\s+");

        String rev=" ";

        for(int i=arr.length-1;i>=0;i--)
        {
            rev+=arr[i]+" ";
        }
        System.out.println(rev.trim());


         // TC==> O(n2);
        // SC==> O(n);

    }
}
