package assignments;

public class Assignment11 {
  public void driver() {
//	  printN(10);
//	  printNreverse(10);
//	  printFirstEven(10);
//	  printFirstEvenRev(10);
	  printFirstOdd(10);
	  System.out.println();
	  printFirstOddRev(10);
  }
	
  
  
  
  public void printN(int N) {
	  if(N==0) {
		  return;
	  }
	  printN(N-1);
	  System.out.print(N+" ");
	  
  }
  
  public void printNreverse(int N) {
	  if(N==0) {
		  return;
	  }
	  System.out.print(N+" ");
	  printNreverse(N-1); 
  }
  
  public void printFirstEven(int N) {
	  if(N==0) {
		  return;
	  }
	  
	  printFirstEven(N-1);
	  System.out.print(2*N+" ");
	  
  }
  
  public void printFirstEvenRev(int N) {
	  if(N==0) {
		  return;
	  }
	  System.out.print(2*N+" ");
	  printFirstEvenRev(N-1);
	 
  }
  
  
  public void printFirstOdd(int N) {
	  if(N==0) {
		  return;
	  }
	  
	  printFirstOdd(N-1);
	  System.out.print(2*N-1+" ");
	  
  }
  
  
  public void printFirstOddRev(int N) {
	  if(N==0) {
		  return;
	  }
	  System.out.print(2*N-1+" ");
	  printFirstOddRev(N-1);
	 
  }
  
  
  
  
}
