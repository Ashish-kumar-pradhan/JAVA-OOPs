package methods;

public class MainClass {
	
	int logic(int x , int y) {
		
		int z = x + y;
		
		return z;
		
	}
		

	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		MainClass obj = new MainClass(); //object creation
		int c = obj.logic(a,b);
		System.out.println(c);
		int d = obj.logic(c,b);
		System.out.println(d);
		

	}

}
