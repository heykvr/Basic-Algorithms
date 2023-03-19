/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    public static int partition(int []a,int lb,int ub){
        int pivot=a[lb];
        int start=lb;
        int end=ub;
        while(start<end){
            while(a[start]<=pivot)
            {
                start++;
            }
            while(a[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                swap(a,start,end);
            }
            
            
        }
        swap(a,lb,end);
     
        return end;
    }
    public static void quicksort(int start,int end,int arr[])
    {
        if(start>end)
        {
            return;
        }
        if(start==end)
        {
            return;
        }
        int indexOfPivot=partition(arr,start,end);
        quicksort(start,indexOfPivot-1,arr);
        quicksort(indexOfPivot+1,end,arr);
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("No of items in an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter data");
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		quicksort(0,n-1,a);
	    
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(a[i]+" ");
	    }
	}
}