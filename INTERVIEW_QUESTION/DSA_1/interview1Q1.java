package INTERVIEW_QUESTION.DSA_1;
import java.util.HashMap;

public class interview1Q1 {
    public static void main(String[] args) {
        
        // Q 1. Print this Pattern
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        System.out.println("==============================================================");
        int n=5;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    System.out.println("==============================================================");
     
    // Q2. Print this Pattern
    // Sol
    //     *
    //     **
    //     ***           
    //     ****
    //     *****


      for(int i=n;i>=1;i--)
      {
        for(int j=n-i+1;j>=1;j--)
        {
            System.out.print("*");
        }
        System.out.println();
      }


System.out.println("==============================================================");

    //   Q3. Reverse the string.
    //   Inp s = “hello”
    //   sol : "olleh";

    String s="hello";

    String rev="";
    for(int i=s.length()-1;i>=0;i--)
    {
        rev+=s.charAt(i);
    }
    System.out.println(rev);


    System.out.println("==============================================================");
    
    // Q4. Find Largest Element
    // Input: [10, 20, 8, 15]
    // Sol.

    int[] arr={10,20,8,15};

    int max=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
        
    }
    System.out.println(max);

    System.out.println("==============================================================");

    // Q 5. Count Frequency of Each Element
    // arr= [1, 2, 2, 3, 3, 3]
    // Sol. 

    int[] arr1={1,2,2,3,3,3};

    HashMap<Integer,Integer> map=new HashMap<>();
   
     for(int x:arr1)
      {
        map.put(x,map.getOrDefault(x, 0) +1);
      }
      
      for(int key:map.keySet())
      {
        System.out.println(key+ "-->"+map.get(key));
      }



    System.out.println("==============================================================");

    }
    
}
