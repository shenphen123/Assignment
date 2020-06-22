package core.java.markup;

public class CalculateOperation {

	
	public void calculateAreaForShape(Object obj) throws CalculateAreaNotSupported{
		if(obj instanceof IShape){
			((Rectangle)obj).calArea();
		}else{
			throw new CalculateAreaNotSupported("Calculate Area Not Supported");
		}
	}
}
