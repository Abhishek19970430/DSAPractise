package assignments;

import java.awt.dnd.peer.DropTargetPeer;

public class Assignment6 {
	public void driver() {
//	 CDLL obj = new CDLL();

	}

}

class CDLL {
	Node start;

	class Node {

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
		return start == null;
	}

	public void insertFirst(int data) {
		Node n = new Node();
		n.setItem(data);

		if (isEmpty()) {
			start = n;
			n.setNext(n);
			n.setPrev(n);
		} else if (start.getPrev() == start.getNext()) {
			n.setPrev(start);
			n.setNext(start);
			start = n;
		} else {
			n.setNext(start);
			n.setPrev(start.getPrev());
			start.getPrev().setNext(n);
			start.setPrev(n);
			start = n;

		}

	}

	public void insertLast(int data) {
		Node n = new Node();
		n.setItem(data);

		if (isEmpty()) {
			start = n;
			n.setNext(n);
			n.setPrev(n);
		} else if (start.getPrev() == start.getNext()) {
			n.setPrev(start.getNext());
			n.setNext(start);
			start.setNext(n);
			start.setPrev(n);
		} else {
			n.setPrev(start.getPrev());
			n.setNext(start);
			start.getPrev().setNext(n);
			start.setPrev(n);
		}
	}

	public Node search(int value) {

		if (start != null) {
			try {
				Node t;
				t = start.getNext();
				do {
					if (t.getItem() == value) {
						return t;
					}
					t = t.getNext();
				} while (t != start.getNext());
				return null;

			} catch (NullPointerException e) {
				return null;
			}
		}else {
			System.out.println("Can not Search List is Empty");
		}

	}
	
	public void insertAfter(int data, Node t) {
		if(t!=null) {
			if(start.getNext()==start.getPrev()) {
				insertLast(data);
			}
			Node n = new Node();
			n.setPrev(t);
			n.setNext(t.getNext());
			t.getNext().setPrev(n);
			t.setNext(n);
			
		}else {
			System.out.println("Item Not Found in a List");
		}
		
		
	}

	
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("Can Not delete List is Empty");
		}else if(start.getPrev()==start.getNext()) {
			start= null;
		}else {
			start.getPrev().setNext(start.getNext());
			start.getNext().setPrev(start);
			 
		}
	}
}
