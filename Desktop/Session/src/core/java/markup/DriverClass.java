package core.java.markup;

public class DriverClass {

	public static void main(String[] args) {
		
		CalculateOperation co = new CalculateOperation();
		try{
		
		co.calculateAreaForShape(new Square());

	}catch(CalculateAreaNotSupported e){
		System.out.println(e.getMessage());
	}

}
}