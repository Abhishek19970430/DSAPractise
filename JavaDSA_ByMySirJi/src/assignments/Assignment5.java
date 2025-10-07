package assignments;

public class Assignment5 {

	public void driver() {
		CLL ob1 = new CLL();
		ob1.insertFirst(20);
		ob1.insertFirst(30);
		ob1.insertFirst(50);
		ob1.insertFirst(70);
		ob1.insertAfter(99, ob1.Search(30));
		ob1.insertLast(40);
	
		ob1.display();
		ob1.deleteFirst();
        ob1.display();
        ob1.deleteLast();
        ob1.display();
		
		System.out.println(ob1.isEmpty());	
		
	}
	
	public class CLL{
		 private Node last;
		
		public class Node{
			private int item;
			private Node next;
			public void setItem(int data) {
				this.item= data;
			}
			
			public void setNext(Node next) {
				this.next= next;
			}
			
			public int getItem() {
				return item;
			}
			
			public Node getNext() {
				return next;
			}
		}
			
			public boolean isEmpty() {
				return last== null;
			}
			
			public void insertFirst(int data) {
				Node n = new Node();
				n.setItem(data);
				
				if(isEmpty()) {
					
					last= n;
					n.setNext(last);
				}else {
					n.setNext(last.getNext());
					last.setNext(n);
				}
			}
			
			
			public void insertLast(int data) {
				Node n = new Node();
				n.setItem(data);
				
				if(isEmpty()) {
					
					n.setNext(last);
				}else {
					n.setNext(last.getNext());
					last.setNext(n);
					
				}
				last= n;
				
			}
			
	 public Node Search (int value) {
		 try {
			 Node t;
			 t= last.getNext();
			 do {
				 if(t.getItem()== value){
					 return t;
				 }
				 t= t.getNext();
			 }while(t!=last.getNext());
			 return null;
			 
		 }catch(NullPointerException e){
			 return null;
		 }
		 
	 }
	 
	 public void insertAfter(int data, Node t) {
		 if(t!=null) {
			 Node n= new Node();
			 n.setItem(data);
			 
			 n.setNext(t.getNext());
			 t.setNext(n);
			 
			 if(t==last) {
				 last= n;
			 }
			 
		 }
		 
		
	 }
	 
	 public void deleteFirst() {
		 if(isEmpty()) {
			 System.out.println("Cant Delete List is Empty");
		 }else if(last.getNext()==last){
			 last= null;
		 }else {
			 Node second;
			 second = last.getNext().getNext(); 
			 last.setNext(second);
		 }
	 }
	 
	 public void deleteLast() {
		 if(isEmpty()) {
			 System.out.println("Cant Delete List is Empty");
		 }else if(last.getNext()==last){
			 last= null;
		 }else {
			 Node t;
			 t= last;
			 
			 while(t.getNext()!=last) {
				 t= t.getNext();
			 }
			 
			 t.setNext(last.getNext());
			 last= t;
			 
		 }
	 }
	 
	 
	 public void deleteAtValue(int value){
		 Node temp= Search(value);
		 
		 if(temp==null) {
			 System.out.println(" Can not Delete because Value Not Found  ");
		 }else {
			 Node t= last;
			 while(t.getNext()!=temp) {
				 
				 t= t.getNext();
			 }
			 t.setNext(temp.getNext());
			 
		 }
		 
		 
	 }
	 
	 
	 
	 
	 
			
			
	 public void display() {
			Node temp = last.getNext();
			System.out.println();
			do {
				System.out.print(temp.getItem()+" ");
				temp=temp.getNext();
			}while(temp!=last.getNext());
		}
	 
	 
	 
	 
	 
		}
	}
	
	

