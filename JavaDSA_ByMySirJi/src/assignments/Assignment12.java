package assignments;

public class Assignment12 {
  public void driver() {
//	  System.out.println(sumN(3));
//	  System.out.println(sumEvenN(3));
//	  System.out.println(sumOddN(3));
//	  System.out.println(facto(5));
//	  System.out.println(sumOfDigit(68));
  }
  
  public int sumN(int N) {
	  if(N==0) {
		  return 0;
	  }
	  int sum = N+sumN(N-1);
	  return sum;
  }
  
  public int sumEvenN(int N) {
	  if(N==0) {
		  return 0;
	  }
	  int sum = 2*N+sumEvenN(N-1);
	  return sum;
  }
  
  public int sumOddN(int N) {
	  if(N==0) {
		  return 0;
	  }
	  int sum = 2*N-1+sumOddN(N-1);
	  return sum;
  }
	
  
  public int facto(int N) {
	  if(N==0) {
		  return 1;
	  }
	  int result= N*facto(N-1);
	  return result;
  }
	
  public int sumOfDigit(int N) {
	  
	  if(N==0) {
		  return 0;
	  }
	  
	   int sum =( N%10) + sumOfDigit(N/10);
	   return sum;
  }
}
