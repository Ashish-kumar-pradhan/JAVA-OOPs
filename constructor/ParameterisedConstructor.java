package constructor;

class Vehi { //not taking Vehicle as a class 
	
	int wheels;
	int headLights;
	Vehi(int noOfWheels) {
		wheels= noOfWheels;
		headLights = 2; 
	}
}


public class ParameterisedConstructor {
	ParameterisedConstructor () {
		System.out.println("object is created");
	}
	

	

	public static void main(String[] args) {
		


		Vehi bike = new Vehi(2);
		Vehi car = new Vehi(4);
		
		

		System.out.println("Bike has "+ bike.wheels + " Wheels and "+ bike.headLights +" HeadLights");
		System.out.println("Car has "+ car.wheels + " Wheels and "+car.headLights+" HeadLights");

		

	}

}
