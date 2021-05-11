package abstraction;

public class Car {
	
	public static void repaircar(WagonR car) {
		 System.out.println("Car is Repaired ");
	}
	

	public static void repaircar(Audi car) {
		 System.out.println("Car is Repaired ");
	}
	
	public static void main(String[] args) {
		
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
		repaircar(wagonR);
		repaircar(audi);
	}

}
