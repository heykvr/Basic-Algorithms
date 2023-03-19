/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int []a={1,2,3,4,5,6,7,8,8,9,1};
		int find=5;
		int low=0,high=a.length-1;
		
		while(low<=high)
		{
		    int mid=(low+high)/2;
		    
		    if(a[mid]==find)
		    {
		        System.out.println(mid);
		        break;
		    }
		    else if(a[mid]>find)
		    {
		        high=mid-1;
		    }
		    else
		    {
		        low=mid+1;
		    }
		}
		
		
	}
}
