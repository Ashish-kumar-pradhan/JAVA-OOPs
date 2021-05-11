package classObjects;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any thing ");
		int x = sc.nextInt();
		Student s1 = new Student();
		s1.name = "Ashish";
		s1.rollNumber = 14;
		Student s2 = new Student();
		s2.name = "kumar";
		s2.rollNumber = 10;
		
		System.out.println(s1.rollNumber+" "+s1.name);
		System.out.println(s2.name+" "+s2.rollNumber);


	}

}
