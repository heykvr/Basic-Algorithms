import java.util.*;
class stack
{
    int top=-1;
    int n=10;
    int []a=new int[n];
    Scanner sc=new Scanner(System.in);
    void push()
    {
        if(top==n-1)
        {
            System.out.println("Overflow");
        }
        else
        {
            System.out.println("Enter data :");
            int i=sc.nextInt();
            top++;
            a[top]=i;
            System.out.println("item inserted");
        }
        
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Underflow");
            
        }
        else
        {
            top--;
            System.out.println("item deleted");
        }
        
    }
    void display()
    {
         System.out.println("items are :");
         for(int j=top;j>=0;j--){
             System.out.println(a[j]);
         }
        
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    
	    Scanner sc=new Scanner(System.in);
	    stack s=new stack();
	    //s.push();
	    //s.pop();
	    //s.display();
	    int l;
	    do
	    {
	        System.out.println("press 1 for push");
	        System.out.println("press 2 for pop");
	        System.out.println("press 3 for display");
	        System.out.println("press 0 for Exit");
	        int d=sc.nextInt();
	        switch(d)
	        {
	            case 1:
	                {
	                    s.push();
	                    break;
	                }
	            case 2:
	                {
	                    s.pop();
	                    break;
	                }
	            case 3:
	                {
	                    s.display();
	                    break;
	                }
	        }
	        System.out.println("enter 0 to go back to menu");
	        System.out.println("enter any key(number) to exit");
	        l=sc.nextInt();
	    }
	    while(l==0);
	    System.out.println("Exit Successfully");
    }
}