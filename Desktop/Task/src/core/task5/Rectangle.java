package core.task5;

public class Rectangle {
	private int length;
	private  int bredth;

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println("Area of r1: " +r1.area());
		Rectangle r2 = new Rectangle(10,2);
		System.out.println("Area of r2: " +r2.area());
		Rectangle r3 = new Rectangle(20);
		System.out.println("Area of r3: " +r3.area());

	}
	
	public Rectangle(){
		
	}
public Rectangle(int len, int bred){
	this.length = len;
	this.bredth = bred;
	
}
public Rectangle(int len){
this.length = len;
this.bredth = len;
}

public int area(){
	return length * bredth;
}


}
