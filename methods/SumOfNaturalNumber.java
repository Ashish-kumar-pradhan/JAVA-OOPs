package methods;

import java.util.Scanner;

public class SumOfNaturalNumber {

	static int sum(int n) {
		if (n==1) {
			return 1;
		} else {
			return n + sum(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int x = sc.nextInt();
		System.out.println("the factorial of "+x+" is "+ sum(x));


	}

}
