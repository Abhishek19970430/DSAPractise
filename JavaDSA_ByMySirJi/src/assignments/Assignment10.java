package assignments;

public class Assignment10 {

	public void driver() {
		Queue ob1= new Queue();
		ob1.insert(10);
		
		ob1.delete();
		ob1.Display();
		
        
//		System.out.println(ob1.count());
		
		
		
//		System.out.println(ob1.getFront());
//		System.out.println(ob1.getRear());
		System.out.println(ob1.isEmpty());
		
		
	}
	
}

class Queue {
	
	 private Node front;
	 private Node rear;
	class Node{
		
		 private int item;
		 private Node next;
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
	
	public Queue() {
		front= null;
		rear=null;
	}
	
	public void insert(int data) {
		Node n= new Node();
		n.setItem(data);
		n.setNext(null);
		
		if(rear==null) {
			rear= front= n;
		}else {
			rear.setNext(n);
			rear=n;
		}
	}
	
	public int getRear() {
		int x=0;
		try {
			x= rear.getItem();
			return x;
			
		}catch(NullPointerException e) {
			System.out.println("Can not view Element Bacause Queue is Empty");
			
		}
		return x;
	}
	
	public int getFront() {
		int x=0;
		try {
			x= front.getItem();
			return x;
			
		}catch(NullPointerException e) {
			System.out.println("Can not view Element Bacause Queue is Empty");
			
		}
		return x;
	}
	
	public void delete() {
		if(front!=null) {
			if(front== rear) {
				rear=null;
				front = null;
			}else {
				front = front.getNext();
				
			}
		}else {
			throw new ArithmeticException("Empty Queue");
		}
	}
	
	public boolean isEmpty() {
		return front == null && rear == null;
	}
	
	public int count() {
		Node t= front;
		int n=1;
		while(t!=rear) {
			t =t.getNext();
			n++;
		}
		return n;
		
	}
	
	public void Display() {
		try {
		Node t= front;
		System.out.println();
		 do{
			System.out.print(t.getItem()+" ");
			t= t.getNext();
		}while(t!=rear.getNext());
		}catch(NullPointerException e) {
			System.out.println("Can not Display Queue is Empty");
		}
	}
	
	
	
	
	
	
	
}
