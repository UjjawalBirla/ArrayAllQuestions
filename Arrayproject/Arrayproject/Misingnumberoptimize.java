package Arrayproject;
public class Misingnumberoptimize {
    
    public static void main(String[] args) {
        
        int[] arr={1,2,3,5,6};  // -----> 1 to n
        int n= arr.length+1;    // -----> +1 add

        //  int[] arr={0,1,2,3,5,6};  ----> 0 to n
        // int n= arr.length;         ----->+ 1 not added

        int sum=0;
        for(int i: arr)
        {
            sum+=i;
        }
        int missing =n*(n+1)/2-sum;
        System.out.println(missing);

         // TC==> O(n);
        // SC==> O(1);
    }
}
