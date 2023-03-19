import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int low=0;
		int mid=0;
		int high=n-1;
		while(mid<=high)
		{
		    int a1=a[mid];
		    if(a1==0)
		    {
		       int temp=a[mid];
		       a[mid]=a[low];
		       a[low]=temp;
		       low++;
		       mid++;
		    }
		    else if(a1==1)
		    {
		        mid++;
		    }
		    else
		    {
		        int temp1=a[high];
		        a[high]=a[mid];
		        a[mid]=temp1;
		        high--;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
}
