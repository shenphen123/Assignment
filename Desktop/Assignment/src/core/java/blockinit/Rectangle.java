package core.java.blockinit;

public class Rectangle {
	
	int len;
	int bred;
	static int  myStatic;
	
	{
		System.out.println("Non static block init");
		
		len = 10;
		bred = 12;
	}

	static{
		System.out.println("Static block init");
	myStatic = 1;
	}
	
	public Rectangle(){
	System.out.println("Default constructor");
}
}