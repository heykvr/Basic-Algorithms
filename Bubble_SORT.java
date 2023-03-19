import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n =  sc.nextInt();
                int a[] = new int[n];

                for(int i=0; i<n; i++){
                        a[i] = sc.nextInt();
                }
                int count =0;
                for(int i=0; i<(n-1);i++)  //1 to n-1 iterations.
                        {
                                boolean swap = false;
                                for(int j=0; j<(n-1-i); j++)     // 1 to n-2 iterations first
                                        {
                                                if(a[j]>a[j+1]){
                                                        swap = true;
                                                        count++;
                                                        int temp = a[j];
                                                        a[j] = a[j+1];
                                                        a[j+1] = temp;
                                                }
                                        }
                                if(swap == false){
                                        break;
                                }
                        }
                for(int i=0; i<n; i++){
                        System.out.print(a[i]+ " ");
                }
                System.out.println();
                System.out.println("Array is sorted in "+count+" swaps.");
                System.out.println("First Element: "+ a[0]);
                System.out.println("Last Element: "+ a[n-1]);
    
	}
}