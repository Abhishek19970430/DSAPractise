package assignments;

public class Assignment2 {
public void driver() {
	DynArray DA= new DynArray(4);
	DA.append(40);
	
	DA.append(50);
	
	DA.append(70);
	
	DA.append(80);
	
	
	
	for(int i=0;i< DA.getTotal();i++) {
		System.out.print(DA.getValue(i)+" ");
	}
	System.out.println("Capacity ="+ DA.getCapicity());
	DA.delete(0);
	DA.delete(0);
	DA.delete(0);
	
	
	
	
	
	
	for(int i=0;i< DA.getTotal();i++) {
		System.out.print(DA.getValue(i)+" ");
	}
	System.out.println("Capacity ="+ DA.getCapicity());
	
}

}
 class DynArray{
	 private int lastIndex;
	private int [] ptr;
	 
	 public DynArray(int size) {
		 lastIndex=-1;
		 ptr= new int[size];
	 }
	 
	 public void Double(int []arr){
		arr = new int[2*ptr.length];
		
		for(int i=0;i<ptr.length;i++) {
			arr[i]= ptr[i];
		}
		ptr= arr;
	 }
	 
	 public void append(int data) {
		 
		 try {
			 if(lastIndex== ptr.length-1) {
				 Double(ptr);
			 }
			 ptr[lastIndex+1]= data;
			 lastIndex++;
		 } catch(ArrayIndexOutOfBoundsException e) {
			 
			 System.out.println(e.getMessage());
			 
		 }
		 
	 }
	 
public void insert(int data, int index) {
		 
		 try {
			 if(index<0 || index>lastIndex) {
				 throw new ArrayIndexOutOfBoundsException(" Invalid Index");
			 }
			 if(lastIndex== ptr.length) {
				 Double(ptr);
			 }
			 
			 for(int i= lastIndex; i>=index; i--) {
				 ptr[i+1]= ptr[i];
			 }
			 ptr[index]= data;
			 lastIndex++;
			 
		 } catch(ArrayIndexOutOfBoundsException e) {
			 
			 System.out.println(e.getMessage());
			 
		 }
		 
	 }

public void edit( int data, int index ) {
	try {
		if(index< 0 || index >lastIndex) {
			throw new ArrayIndexOutOfBoundsException("Invalid Index");
			
		}
		ptr[index]= data; 
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
}

public void halfArray() {
	int arr[] = new int[(ptr.length)/2] ;
	for(int i=0;i<arr.length;i++) {
		arr[i]= ptr[i];
	}
	ptr= arr;
}


public void delete(int index) {
	
	try {
		if(index< 0 || index >lastIndex) {
			throw new ArrayIndexOutOfBoundsException("Invalid Index");
		}
		
		for(int i= index; i<lastIndex;i++) {
			ptr[i]= ptr[i+1];
		}
		
		lastIndex--;
		
		if(ptr.length>0 && lastIndex+1 == ptr.length/2  ) {
			halfArray();
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
	
	
}

public int getTotal() {
	return lastIndex+1;
}

public boolean isEmpty() {
	return ptr.length==0;
}

public int getValue(int index) {
	return ptr[index];
}
	 

public int getCapicity() {
	return ptr.length;
}
	 
	 
	 
 }