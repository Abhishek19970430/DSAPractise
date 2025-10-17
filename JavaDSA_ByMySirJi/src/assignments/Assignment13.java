package assignments;

public class Assignment13 {
    
	public void driver() {
//		System.out.println(fibonacii(4));
//		printBinary(48);
//		printOctal(98);
//		revNumber(9811);
		System.out.println(sumOfSq(3));
	}
	
	
	public int fibonacii(int N) {
		if(N==0||N==1) {
			return N;
		}
		
		int result= fibonacii(N-2)+fibonacii(N-1);
		return result;
		
	}
	
	public void printBinary(int N) {
		
		if(N==0) {		
			return ;
		}
		printBinary(N/2);
		System.out.print(N%2+" ");
		
	}
	
public void printOctal(int N) {
		
		if(N==0) {		
			return ;
		}
		printOctal(N/8);
		System.out.print(N%8+" ");
		
	}

public void revNumber(int N) {
	
	if(N==0) {		
		return ;
	}
	System.out.print(N%10+" ");
	revNumber(N/10);
	
}

public int sumOfSq(int N) {
	
	if(N==0) {
		return 0;
	}
	
	   int sum= N*N + sumOfSq(N-1);
	   return sum;
	
}


	
}
