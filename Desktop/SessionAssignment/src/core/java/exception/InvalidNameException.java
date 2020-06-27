package core.java.exception;

public class InvalidNameException extends Exception{
	public InvalidNameException(String name){
super(name);
}
	public InvalidNameException(){
		super("test");
}
}