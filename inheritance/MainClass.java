package inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		TeacherClass t = new TeacherClass();
		SingerClass s = new SingerClass();
		
		t.name = "Mr. Harry ";
		t.eat();
		t.walk();
		t.teach();
		
		s.name = "Mr. Tic Brown" ;
		s.eat();
		s.walk();
		s.sing();
		
			

	}

}
