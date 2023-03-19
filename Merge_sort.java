import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
    // merge (Combination part)
    public static void merge(int start,int mid,int end,int arr[])
    {
        // first half of the array --> (start -- mid)
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=start;i<=mid;i++)
        {
            A.add(arr[i]);
        }
        // second half of the array --> (mid+1 -- en)
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=(mid+1);i<=end;i++)
        {
            B.add(arr[i]);
        }
        
        // Combine these two sorted parts 
        ArrayList<Integer> C = new ArrayList<>();
        int i = 0; 
        int j = 0;
        
        while(i<A.size() && j<B.size())
        {
            if(A.get(i) <= B.get(j))
            {
                C.add(A.get(i));
                i++;
            }
            else
            {
                C.add(B.get(j));
                j++;
            }
        }
        
        // Elements from B ArrayList are left
        while(j<B.size())
        {
            C.add(B.get(j));
            j++;
        }
        
        // Elements from A ArrayList are left
        while(i<A.size())
        {
            C.add(A.get(i));
            i++;
        }
        
        // C --> Sorted part of Two combined sorted arrays (0---)
        
        // Update the original Array (Some Segment of Array gets sorted)
        int v = start;
        for(int k=0;k<C.size();k++)
        {
            // what is the position in which element should be updated 
            arr[v] = C.get(k);
            // arr[k] = C.get(k); WRONG 
            // arr[start+k] = C.get(k); CORRECT
            v++;
        }
    }
    // divide --> log N  
    public static void mergeSort(int start,int end,int arr[])
    {
        // base case 
        if(start == end)
        {
            // there is only one element 
            return;
        }
        
        // recursive case 
        int mid = (start+end)/2;
        
        mergeSort(start,mid,arr); // first half of the array --> (st -- mid)
        mergeSort(mid+1,end,arr); // second half of the array --> (mid+1 -- en) 
        
        // merge first & second half of the array
        merge(start,mid,end,arr); // --> O(N)
    }
	public static void main (String[] args) 
	{
	    Scanner in = new Scanner(System.in);
	    
	    int n = in.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = in.nextInt();
	    }
	    
	    // O(N log N)
	    mergeSort(0,n-1,arr);
	    
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}