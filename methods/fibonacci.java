package methods;

public class fibonacci {
	
	static int fibonacci(int a) {
		if (a == 0) {
			return 0;
		} else if(a==1){
			return 1;
		}else {
			return fibonacci(a-1) + fibonacci(a-2) ;
		}
	}

	public static void main(String[] args) {
		
		int n = 6 ;
		System.out.println("The finonacci series is  "+ fibonacci(n));
		

	}

}
