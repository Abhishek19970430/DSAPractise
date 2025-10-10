package assignments;

public class Assignment7 {
    
	public void driver() {
		Stack obj= new Stack(5);
		obj.push(99);
		obj.push(88);
		obj.push(77);
		obj.push(66);
		obj.push(55);
		obj.push(35);
		obj.printStack();
		System.out.println();
//		obj.pop();
//		obj.pop();
//		obj.pop();
//		obj.pop();
//		obj.pop();
        obj.printStack();
//        System.out.println(obj.isUnderFlow());
//        System.out.println(obj.isOverFlow());
        

		
	}
	
}


class Stack{
	private int top;
	private int [] ptr;
	private int size;
	 public Stack(int value) {
		 this.top =-1;
		 this.size= value;
		 this.ptr = new int [size];
	 }
	
	
	public void push(int data) {
		try {
			ptr[top+1]= data; // ye line upar rakhne se bina top me update kiye             // Exception Handle ho jayegi.
			top++;
			
		}catch(Exception e) {
			System.out.println("Stack OverFlow");
		}
		
		
	}
	
	public int peek() {
		int x=0;
		try {
			x= ptr[top];
		}catch(Exception e) {
			System.out.println("Stack UnderFlow");
		}
		return x;
	}
	
	public int pop() {
		int x =0;
		try {
			x= top--;
		}catch(Exception e){
			System.out.println("Stack is UnderFlow");
		}
		return x;
	}
	
	public boolean isOverFlow() {
		if(top== ptr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isUnderFlow() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void printStack() {
		try {
			for(int i=0;i<=top; i++) {
				System.out.print(ptr[i]+" ");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}