package classObjects;

public class ComplexNumber {
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real , int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void setReal(int r) {
		this.real = r ;
	}
	public void setImaginary(int i) {
		this.imaginary = i ;
	}
	public void add(ComplexNumber c2) {
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
	}
	public void multiply(ComplexNumber c2) {
		int temp = real;
		this.real = this.real*c2.real - this.imaginary*c2.imaginary;
		this.imaginary = temp*c2.imaginary + this.imaginary*c2.real;
	}
	public static ComplexNumber add(ComplexNumber c1 , ComplexNumber c3) {
		int newReal = c1.real + c3.real;
		int newImaginary = c1.imaginary + c3.imaginary;
		ComplexNumber c = new ComplexNumber(newReal , newImaginary );
		return c;
	}
	public static ComplexNumber conjugate(ComplexNumber c1) {
		 int newReal = c1.real;
		 int newImaginary = c1.imaginary * (-1);
		 ComplexNumber c = new ComplexNumber(newReal , newImaginary );
		 return c;
	}
	
	public void print() {
		if (imaginary < 0) {
			System.out.println(real+" - i"+-1*imaginary);
		}else {
			System.out.println(real+" + i"+imaginary);
		}
	}
	

	
}
