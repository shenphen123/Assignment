package core.java.driver;

import core.java.shape.Circle;
import core.java.shape.Email;
import core.java.shape.Rectangle;

public class Driver {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.calculateArea();
		
		Circle c1 = new Circle();
		c1.calArea();
		
		
		Email e = new Email();
		e.SendEmail();
	}

}
