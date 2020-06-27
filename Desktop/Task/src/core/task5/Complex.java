package core.task5;

public class Complex {
	
	public static void main(String[] args) {

	Complex n1 = new Complex(2, 4); 
	Complex n2 = new Complex(3, 5); 
	Complex sum = n1.sum(n2); 
	Complex difference = n1.difference(n2); 
	Complex multiply = n1.multiply(n2);
	System.out.println("first complex number: " + n1); 
	System.out.println("second complex number: " + n2); 
	System.out.println("sum of two complex numbers: " + sum); 
	
	System.out.println("sum of two complex numbers: " + difference);
	System.out.println("sum of two complex numbers: " + multiply);
	
}
	private final double real; 
	private final double imaginary; 
	public Complex(double real, double imaginary) { 
		this.real = real; this.imaginary = imaginary; 
		}
	public Complex sum(Complex other) { 
		double r = this.real + other.real; 
		double i = this.imaginary + other.imaginary; 
		return new Complex(r, i); 
		}
	public Complex difference(Complex other) { 
		double r = this.real - other.real;
		double i = this.imaginary - other.imaginary; 
		return new Complex(r, i); 
		}
	public Complex multiply(Complex other) { 
		double r = this.real  * other.real;
		double i = this.imaginary * other.imaginary; 
		return new Complex(r, i); 
		}
	public double getReal() {
			return real; 
			} 
	public double getImaginary() { 
		return imaginary;
		}
	@Override 
	public String toString() {
		return real + " + " + imaginary + "i"; 
	}  

}

