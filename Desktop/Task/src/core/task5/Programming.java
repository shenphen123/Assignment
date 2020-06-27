package core.task5;

public class Programming {
	public static void main(String[] args) {
		Programming s = new Programming();
		System.out.println("I love " +s.programming );
		Programming a = new Programming("Java");
	System.out.println("I love " +a.programming);
	
	}String programming;
	public Programming(){
	programming ="programming language";
	}
	

	

public Programming( String Java){
	this.programming = Java;
}






}

