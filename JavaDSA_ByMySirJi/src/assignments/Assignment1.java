package assignments;

public class Assignment1 {
	public void driver() {
		Array a1= new Array(5);
		a1.append(10);
		a1.getTotal();
		a1.append(20);
		a1.getTotal();
		a1.append(30);
		a1.getTotal();
		a1.insert(30, 0);
		a1.getTotal();
		a1.Edit(1, 90);
		a1.getTotal();
		a1.Delete(0);
		a1.getTotal();
		System.out.println(a1.getCapicity());
		
		
	}
 
 
}

class Array {
	   private int lastIndex;
	   private int ptr[]; 
	  public Array(int size){
		  lastIndex=-1;
		  ptr= new int[size];
	  }
	  
	  public void append(int data) {
		  try {
			  ptr[lastIndex+1]= data;
			  lastIndex++;
		  }catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("Array is already full can not add more values");
		  }
	  }
		  
	  public void insert(int data, int index) {
		  try {
			  if(index < 0 || index >lastIndex ) {
				  throw new ArrayIndexOutOfBoundsException("Ivalid Index");
			  }
			  for(int i=lastIndex; i>=index;i--) {
				  ptr[i+1]= ptr[i];
			  }
			  ptr[index]= data;
			  lastIndex++;
			  
		  }catch(ArrayIndexOutOfBoundsException e){
			  System.out.println(e.getMessage());
		  }
	  }
		  
		 
	  
	  public void Edit(int index, int data) {
		  try {
			  if(index < 0 || index >lastIndex ) {
				  throw new ArrayIndexOutOfBoundsException("Ivalid Index");
			  }
			  ptr[index]= data;
			  
			  
		  }catch(ArrayIndexOutOfBoundsException e){
			  System.out.println(e.getMessage());
		  }
	  }
	  
	  public void Delete(int index ) {
		  try {
			  if(index<0 || index>lastIndex) {
				throw new ArrayIndexOutOfBoundsException("Invalid Index Exception");  
			  }
			  for(int i=index;i<lastIndex;i++) {
				  ptr[i]= ptr[i+1];
			  }
			  lastIndex--;
			  
		  }catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("Invalid Index");
		  }
		 
	  }
	  
	  public void getTotal() {
		  for(int i=0; i<=lastIndex;i++) {
			  System.out.print(ptr[i]+" ");
		  }
		  System.out.println();
		  System.out.println("LastIndex:"+ lastIndex);
	  }
	  
	  public boolean isEmpty() {
		  return lastIndex==-1;
		  
	  }
	  
	  public boolean isFull() {
		 return lastIndex+1 == ptr.length;
	  }
	  
	  public int getValue(int index) {
		  try {
			  if(index < 0 || index >lastIndex ) {
				  throw new ArrayIndexOutOfBoundsException("Ivalid Index");
			  }
			  return ptr[index];
			  
		  }catch(ArrayIndexOutOfBoundsException e){
			  System.out.println(e.getMessage());
		  }
		  return 0;
	  }
	   
	  public int getCapicity() {
		  return ptr.length;
	  }
		
	}

