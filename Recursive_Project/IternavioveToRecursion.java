package Recursive_Project;

public class IternavioveToRecursion {
  

  static int recursiveSum(int i,int n)

{

	if(i>=10 || i==n)

	{

		return 0;

	}

	return i+recursiveSum(i+2,n);

}



public static void main(String[] args)

{

	int n=5;

	int result=recursiveSum(0,n);

	System.out.println(result);

}



}

