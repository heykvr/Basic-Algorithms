import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int a[] = new int[n];
	    
	    for(int i=0; i<n; i++){
	        a[i] = sc.nextInt();
	    }
	    int max = a[0];
	    for(int i=0; i<n; i++){
	        if(a[i]> max){
	            max = a[i];
	        }
	    }

	    int f[] = new int[max+1];
	    
	    for(int i=0; i<n; i++){
	        f[a[i]] = f[a[i]] + 1 ;
	    }
	    int leastsold_count = n+1;
	    
	    for(int i=0; i<=max; i++){
	        if(f[i]!=0){
	            leastsold_count = Math.min(leastsold_count, f[i]);
	            System.out.println(i+" --->"+ f[i]);
	        }
	    }
                for (int i = 0; i <= max; i++) {
                        if(f[i]==leastsold_count && f[i]!=0 ){
                                System.out.println(i);
                                break;
                        }
        }
	}
}
