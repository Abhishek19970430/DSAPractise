package assignments;

public class Assignment3 {
   public void driver() {
	   SLL s = new SLL();
//	   
//	 s.insertAtStart(100); 
//	 
//	 s.insertAtStart(200); 
//	 s.insertAtStart(300); 
	 
	 s.insertAtEnd(400);
	 s.insertAtEnd(500);
	 s.insertAtEnd(6);
	 s.insertAtEnd(6);
	 s.insertAtEnd(6);
	 s.insertAtEnd(6);
	 s.insertAtEnd(6);
	 s.Display();
	 s.deleteAfter(500);
	 s.Display();
   }
	
	
}

class SLL{
	private node start=null;
	  
	
	
	public class node{
	private	int item;
	private	node next;
		
		public void setItem(int data) {
			item= data;
		}
		public int getItem() {
			return item;
		}
		
		public void setNext(node next) {
			this.next= next;
		}
		
		public node getNext() {
			return next;
		}
		
		
	}
	
	
	
	public boolean isEmpty() {
		return start==null;
	}
	
	public void insertAtStart(int data) {
		node temp= new node();
		temp.setItem(data); 
		
		if(isEmpty()) {
			start= temp;
			temp.setNext(null);
		}else {
			temp.setNext(start);
			start= temp;
		}
	}
	
	public void insertAtEnd(int data) {
		node temp = new node();
		temp.setItem(data);
		temp.setNext(null);
		node demo;
		if(isEmpty()) {
			start= temp;
			
		}else {
			demo= start;
			while(demo.getNext()!=null) {
				demo= demo.getNext();
			}
			
			demo.setNext(temp);
			
		}
	}
	
	public void Display() {
		node temp= start;
		   while(temp!=null) {
			   System.out.print(temp.getItem() +" ");
			  temp = temp.getNext(); 
		   }
		   System.out.println();
		   
		   
	}
	
	public boolean Search(int value) {
		node temp= start;
		while(temp!= null) {
			
			if(temp.getItem()==value) {
				return true;
			}else {
				temp = temp.getNext();
			}
			
		}
		return false;
	}
	
	
	
	public void insertAfter(node x, int data) {
		if(x!=null) {
			node newNode = new node();
			newNode.setNext(null);
			newNode.setItem(data);
			
			newNode.setNext(x.getNext()); 
			x.setNext(newNode) ;
		}
		
		
	}
	
	
	public void deleteFirst() {
		
			if(!isEmpty()) {
				start= start.getNext();
			}else {
				System.out.println("List is Empty");
			}
			
	}
	
	
	public void deleteLast() {
		node tempf;
		node tempb=null;
		if(!isEmpty()) {
			tempf= start;
			while(tempf.getNext()!=null) {
				tempb= tempf;
				tempf= tempf.getNext();
			}
			
			tempb.setNext(null);
			
		}else if(start.getNext()== null){
			start= null;
		}else {
			System.out.println("List is Empty");
		}
		
}
	
	public void deleteNode(int value) { 
		node tempf;
		node tempb=null;
		if(!isEmpty()) {
			tempf= start;
			while(tempf.getItem() != value) {
				tempb= tempf;
				tempf= tempf.getNext();
			}
			
			tempb.setNext(tempf.getNext());
			
		}else {
			System.out.println("List is Empty");
		}
		
	}
	
}
