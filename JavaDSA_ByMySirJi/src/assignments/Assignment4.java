package assignments;

public class Assignment4 {

	public void driver() {
       DLL Da= new DLL();
       Da.insertFirst(10);
       Da.insertLast(70);
       Da.insertAfter(50, 10);
       Da.Disply();
       Da.deleteLast();
       Da.Disply();
		
		
	}
	
	
}
 
class DLL{
	private Node start;
	
	public class Node {
		private int item;
		private Node prev;
		private Node next;
		public int getItem() {
			return item;
		}
		public void setItem(int item) {
			this.item = item;
		}
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node prev) {
			this.prev = prev;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
		
	}
	
	public boolean isEmpty() {
		return start==null;
	}
	
	
	
	public void insertFirst(int data) {
		Node n = new Node();
		n.setItem(data);
		
		n.setPrev(null);
		n.setNext(null);
		if(isEmpty()) {
			start= n;
			n.setPrev(start);
		}else {
			n.setPrev(start);
			start= n;
		}
	}
	
	
	public void insertLast(int data) {
		Node n = new Node();
		n.setItem(data);
		n.setNext(null);
		if(isEmpty()) {
			start= n;
			n.setPrev(start);
		}else {
			Node t;
			t= start;
			while(t.getNext()!= null) {
				t= t.getNext();
			}
			t.setNext(n);
			n.setPrev(t);
		}
	}
	
	
	public Node Search (int value) {
		Node t;
		t= start;
		
		while(t.getNext()!= null ) {
			if(t.getItem()==value) {
				return t;
			}
			   t = t.getNext();
		}
		return null;
		
	}
	
	
	
	public void insertAfter(int data , int value) {
		Node n = new Node();
		n.setItem(data);
		
		if(isEmpty()) {
			start= n;
			n.setPrev(start);
		}else {
			Node x= Search(value);
			if(x!=null) {
				 n.setNext(x.getNext());
				 x.setNext(n);
				 n.setPrev(x);
			}
			
		}
	}
	
	
	public void deleteFirst() {
		if(isEmpty()) {
		   System.out.println("Can not Delete List is Empty");
		}else if(start.next==null) {
			start = null;
		}else {
			start= start.getNext();
		}
	}
	
	
	public void deleteLast() {
		if(isEmpty()) {
			   System.out.println("Can not Delete List is Empty");
			}else if(start.getNext()==null) {
				start = null;
			}else {
				Node t;
				t = start;
				while(t.getNext().getNext()!= null) {
					t= t.getNext();
				}

				t.setNext(null);
				
				
			}
	}
	
	
	public void deleteAT(int value) {
		if(isEmpty()) {
			   System.out.println("Can not Delete, List is Empty");
			}else {
				
				Node x = Search(value);
				
				if(x==null) {
					System.out.println("Cant Delete Value Not Found in a List");
				}else {
					
					Node back = x.getPrev();
					Node Front=x.getNext();
					
					back.setNext(Front);
					Front.setPrev(back);
					
				}
				
			}
		
	}
	
	public void Disply() {
		Node t;
		t= start;
		System.out.println();
		while(t!=null) {
			System.out.print(t.getItem()+" ");
			t= t.getNext();
		}
		
	}
	
	
	
	
	
	
	
	
	
}