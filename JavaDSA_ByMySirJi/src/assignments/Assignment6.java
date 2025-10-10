package assignments;

public class Assignment6 {
	public void driver() {
		CDLL obj = new CDLL();
		obj.insertFirst(10);
		obj.insertFirst(20);
		obj.insertFirst(30);
		obj.insertFirst(40);

	 obj.insertAfter(99, obj.search(40));
	 obj.deleteFirst();
     obj.deleteLast();
     obj.Display();
    obj.deleteNode(30);
		obj.Display();

	}

}

class CDLL {
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
		return start == null;
	}

	public void insertFirst(int data) {
		Node n = new Node();
		n.setItem(data);

		if (isEmpty()) {
			start = n;
			n.setNext(n);
			n.setPrev(n);
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
		} else {
			n.setPrev(start.getPrev());
			n.setNext(start);
			start.getPrev().setNext(n);
			start.setPrev(n);
		}
	}

	public Node search(int value) {
		try {
			Node t;
			t = start;
			do {
				if (t.getItem() == value) {
					return t;
				}
				t = t.getNext();
			} while (t != start);
			return null;
		} catch (NullPointerException e) {
			return null;
		}
	}

	public void insertAfter(int data, Node t) {
		if (t != null) {
			
			Node n = new Node();
			n.setItem(data);
			n.setPrev(t);
			n.setNext(t.getNext());
			t.getNext().setPrev(n);
			t.setNext(n);

		} else {
			System.out.println("Item Not Found in a List");
		}

	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("Can Not delete List is Empty");
		} else if (start.getPrev() == start.getNext()) {
			start = null;
		} else {
			start.getPrev().setNext(start.getNext());
			start.getNext().setPrev(start.getPrev());
			start = start.getNext();

		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("Can Not delete List is Empty");
		} else if (start.getPrev() == start.getNext()) {
			start = null;
		} else {
			Node target = start.getPrev().getPrev();
			target.setNext(start);
			start.setPrev(target);

		}
	}

	public void deleteNode(int value) {
		Node t = search(value);
		if (t != null) {
			if (start.getPrev() == start.getNext()) {
				start = null;
			} else if (t == start) {
				deleteFirst();
			} else if (t == start.getPrev()) {
				deleteLast();
			} else {
				t.getPrev().setNext(t.getNext());
				t.getNext().setPrev(t.getPrev());
			}
		}

	}

	public void Display() {
		Node t = start;
		System.out.println();
		do {
			System.out.print(t.getItem() + " ");
			t = t.getNext();
		} while (t != start);
	}

}
