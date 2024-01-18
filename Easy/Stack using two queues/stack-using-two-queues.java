//{ Driver Code Starts
import java.util.*;


class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends



class Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    // Function to push an element into the stack using two queues.
    void push(int a) {
        q1.add(a);	
    }
    
    // Function to pop an element from the stack.
    int pop() {
        if (q1.size() == 0) {
            return -1; // Stack is empty
        }
	    
        // Move all elements except the last one from q1 to q2.
        while (q1.size() != 1) {
            int element = q1.remove();
            q2.add(element);
        }
	    
        // Remove the last element from q1 (top of the stack).
        int temp = q1.remove();
	    
        // Swap the names of q1 and q2.
        Queue<Integer> tempQueue = q1;
        q1 = q2;
        q2 = tempQueue;
	    
        return temp;
    }
}


