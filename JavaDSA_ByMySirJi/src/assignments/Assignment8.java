package assignments;

public class Assignment8 {
    public void driver() {
    StackList x= new StackList();	
    x.push(10);
    x.push(20);
    x.push(30);
    x.push(40);
    x.display();
    x.pop();
    x.display();
    
    }
}
    
    class StackList{
    	
    	Node top;
    	
    	public class Node{
    		 int item;
    		 Node next;
			public int getItem() {
				return item;
			}
			public void setItem(int item) {
				this.item = item;
			}
			public Node getNext() {
				return next;
			}
			public void setNext(Node next) {
				this.next = next;
			}
    		 
    	}
    	
    	


		


		// we implement push by inserting node at start 
    	public void push(int data) {
    		Node n = new Node();
    		n.setItem(data);
    		n.setNext(top);
    		top= n;
   
    	}
    	
    	
    	public int peek() {
    		int x=0;
    		try {
    			x = top.getItem();
        		
    		}catch(NullPointerException e) {
    			System.out.println("Stack is Empty");
    			
    		}
    		return x;
    	}
    	
    	
    	
    	public int pop() {
    		int x=0;
    		try {
    			x= top.getItem();
    			top= top.getNext();
    		}catch(NullPointerException e) {
    			System.out.println("Stack is UnderFlow");
    			
    		}
    		return x;
    	}
    	
    	public boolean isEmpty() {
    		return top==null;
    	}
    	 
    	public void reverse() {
    		StackList temp= new StackList();
    		while(!isEmpty()) {
    			temp.push(pop());
    		}
    		
    		StackList t = new StackList();
    		while(!temp.isEmpty()) {
    			t.push(temp.pop());
    		}
    		
    		while(!t.isEmpty()) {
    			push(t.pop());
    		}
    	}
    	
    	public static void reveseStack(StackList s) {
    		StackList temp = new StackList();
    		
    		while(!s.isEmpty()) {
    			temp.push(s.pop());
    		}
    		s= temp;
    	}
    	
    	public void display() {
    		Node t= top;
    		System.out.println();
    		while(t!=null) {
    			System.out.print(t.getItem()+" ");
    			t= t.getNext();
    		}
    	}
    }
    
    
	

