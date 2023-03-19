import java.util.*;
class queue
{
    int n=10;
    int a[]=new int[n];
    int front =-1;
    int rear=-1;
    Scanner sc=new Scanner(System.in);
    void enque()
    {
        System.out.println("Enter data:");
        int i=sc.nextInt();
        if(rear==n)
        {
            System.out.println("Overflow");
        }
        
        else if(front==-1&&rear==-1)
        {
            front++;
            rear++;
            a[rear]=i;
            System.out.println("item inserted");
        }
        else
        {
            rear++;
            a[rear]=i;
            System.out.println("item inserted");
        }
    }
    void deque()
    {
        if(front>rear){
            
            System.out.println("Underflow");
        }
        else{
            front++;
            System.out.println("item deleted");
        }
        
    }
    void display()
    {
        for(int j=front;j<=rear;j++){
            System.out.println(a[j]);
        }
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    queue q=new queue();
	    int l;
	    do
	    {
	    System.out.println("press 1 for enque");
	    System.out.println("press 2 for deque");
	    System.out.println("press 3 for display");
	    System.out.println("press 0 for exit");
	    int d=sc.nextInt();
	    switch(d)
	    {
	        case 1:
	            {
	                q.enque();
	                break;
	            }
	        case 2:
	            {
	                q.deque();
	                break;
	            }
	       case 3:
	           {
	               q.display();
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