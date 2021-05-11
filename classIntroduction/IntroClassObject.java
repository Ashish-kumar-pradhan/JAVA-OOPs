package classIntroduction;

class Cat {
	boolean hasFur;
	String colour, breed ;
	int legs , eyes;
	
	public void walk() {
		System.out.println("Cat is walking ");
	}
	
	public void eat() {
		System.out.println("Cat is eating ");
	}

	public void description() {
		System.out.println("My cat has "+legs+" legs and "+eyes+"eyes");
	}
	
	
}

class Dog {
	String name , breed ;
	
	public void jump() {
		System.out.println("my dog "+name+" is jumping ");
	}
	
	public void run() {
		System.out.println("dog is runing ");
	}
	
}

public class IntroClassObject {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat ();
		Cat cat2 = new Cat ();
		Cat cat3 = new Cat ();
		
		cat1.eat();
		cat2.walk();
		
		cat1.legs= 5;
		cat2.legs= 3;
		
		cat3.legs= 2;
		

		cat1.eyes= 6;
		cat2.eyes= 2;
		
		cat3.eyes= 1;
		
		

		cat1.description();
		cat2.description();
		cat3.description();



	}

}
