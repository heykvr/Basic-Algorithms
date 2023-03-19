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
                
                int count = 0;
                
                for(int i=0; i<n-1; i++)
{
                    int minelement = a[i];
                    int indexofmin = i;
                    for(int j= i+1; j<n; j++)
 {
                        if(a[j] < minelement){
                            minelement = a[j];
                            indexofmin = j;
                        }
                    }
                    if( i!= indexofmin){   //swapping iTH element with minelement
                        count++;
                        int temp = a[i];
                        a[i] = a[indexofmin];
                        a[indexofmin] = temp;
                    }
                }
                for(int i=0; i<n; i++){
                        System.out.print(a[i]+ " ");
                }
                System.out.println();
                System.out.println(count+ " is the number of swaps.");
                
	}
}