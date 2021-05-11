package encapsulation;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 20){
			System.out.print("You are too old to be a student ");
		} else {
		this.age = age ;
		}
	}

}
