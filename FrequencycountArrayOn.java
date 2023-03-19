import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    /// 12347846891234
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = in.nextInt();
		}
		
		// Time Complexity - O(N)
		// Space Complexity - O(maximumElement)
        
        // 1. Find maximum value 
        // 2. Create a frequency array of size = (maximumElement + 1)
        // 3. We will calculate frequency of every element 
        
        int maximumElement = 0;
        for(int i=0;i<n;i++)
        {
            maximumElement = Math.max(maximumElement, arr[i]);
        }
        
        // indexes behave as original elements of the array 
        
        // initially all elements have 0 frequency
        int fre[] = new int[(maximumElement+1)]; 
        
        // array -> 5 2 3 4 5 
        // frequency array -> 0 0 0 0 0 0
        
        // i = 0, fre --> 0 0 0 0 0 1
        // i = 1, fre --> 0 0 1 0 0 1
        // i = 2, fre --> 0 0 1 1 0 1
        // i = 3, fre --> 0 0 1 1 1 1
        // i = 4, fre --> 0 0 1 1 1 2
        for(int i=0;i<n;i++)
        {
            fre[arr[i]] = fre[arr[i]]+1;
        }
        
        for(int i=0;i<=maximumElement;i++)
        {
            if(fre[i]!=0)
            {
                System.out.println(i+" --> " + fre[i]);
            }
        }
	}
}