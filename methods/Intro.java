package methods;

public class Intro {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		int result = maxOf(firstNumber, secondNumber);
		
		maxOf(100,200);
		
		maxOf(2 , 4);
		
		System.out.println(result);
		

	}
	
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}

}
